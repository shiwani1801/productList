package com.springboot.product.mapper;

import com.springboot.product.dto.CategoryDto;
import com.springboot.product.entity.Category;

public class CategoryMapper {
//entity to dto
    public static CategoryDto toCategoryDTO(Category category){
        if(category==null){
            return null;
        }
        CategoryDto categoryDto=new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setProducts(category.getProducts().stream().map(ProductMapper::toProductDto).toList());
    return categoryDto;
    }

    //dto to entity
    public static Category toCategoryEntity(CategoryDto categoryDto){
        Category category=new Category();
        category.setName(categoryDto.getName());
        return category;
    }
}
