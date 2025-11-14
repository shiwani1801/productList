package com.springboot.product.service;

import com.springboot.product.dto.CategoryDto;
import com.springboot.product.entity.Category;
import com.springboot.product.mapper.CategoryMapper;
import com.springboot.product.repository.CategoryRepository;
import com.springboot.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryDto createCategory(CategoryDto categoryDto){
   Category category= CategoryMapper.toCategoryEntity(categoryDto);
 category=categoryRepository.save(category);
 return CategoryMapper.toCategoryDTO(category);

    }
}


