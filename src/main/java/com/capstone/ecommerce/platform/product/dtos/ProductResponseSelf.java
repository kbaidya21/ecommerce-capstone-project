package com.capstone.ecommerce.platform.product.dtos;

import com.capstone.ecommerce.platform.product.models.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductResponseSelf {
    private Product product;
    private String message;
}