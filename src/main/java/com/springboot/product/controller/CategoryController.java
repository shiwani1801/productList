package com.springboot.product.controller;

import com.springboot.product.dto.CategoryDto;
import com.springboot.product.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    //getAllCategories

    @PostMapping
    public ResponseEntity<CategoryDto> CreateCategory(@RequestBody CategoryDto categoryDto){
        return new ResponseEntity<>( categoryService.createCategory(categoryDto), HttpStatus.CREATED);
    }
    //create category
    //get category by id
    //delete category

}
