package com.springboot.product.mapper;

import com.springboot.product.dto.ProductDto;
import com.springboot.product.entity.Category;
import com.springboot.product.entity.Product;

public class ProductMapper {

    public  static ProductDto toProductDto(Product product){
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory().getId()
        );


    }

    public static Product toProdutEntity(ProductDto productDto, Category category){
        Product product=new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setCategory(category);
        return product;
    }
}
