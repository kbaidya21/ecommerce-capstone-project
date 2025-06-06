package com.capstone.ecommerce.platform.common.services;

import java.util.List;

import com.capstone.ecommerce.platform.product.models.Category;

public interface ICategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);
}