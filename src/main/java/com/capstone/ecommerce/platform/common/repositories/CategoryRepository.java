package com.capstone.ecommerce.platform.common.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.platform.product.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
    boolean existsByName(String name);
}