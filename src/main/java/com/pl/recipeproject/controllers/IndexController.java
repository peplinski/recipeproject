package com.pl.recipeproject.controllers;

import com.pl.recipeproject.domain.Category;
import com.pl.recipeproject.domain.UnitOfMeasure;
import com.pl.recipeproject.repositories.CategoryRepository;
import com.pl.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Tablespoon");


        return "index";
    }
}