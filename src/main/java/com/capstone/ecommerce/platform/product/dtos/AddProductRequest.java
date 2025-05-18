package com.capstone.ecommerce.platform.product.dtos;

import lombok.Data;

import java.math.BigDecimal;

import com.capstone.ecommerce.platform.product.models.Category;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}