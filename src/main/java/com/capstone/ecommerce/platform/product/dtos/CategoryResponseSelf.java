package com.capstone.ecommerce.platform.product.dtos;

import com.capstone.ecommerce.platform.product.models.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CategoryResponseSelf {
    private Category category;
    private String message;
}