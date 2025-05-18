package com.capstone.ecommerce.platform.common.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.capstone.ecommerce.platform.product.dtos.ImageDto;
import com.capstone.ecommerce.platform.product.models.Image;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file,  Long imageId);
}