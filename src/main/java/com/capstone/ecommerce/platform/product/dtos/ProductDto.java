package com.capstone.ecommerce.platform.product.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

import com.capstone.ecommerce.platform.product.models.Category;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
    private List<ImageDto> images;
}