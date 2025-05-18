package com.capstone.ecommerce.platform.common.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.platform.product.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long id);
}