package com.capstone.ecommerce.platform.common.services;

import java.util.List;

import com.capstone.ecommerce.platform.product.dtos.AddProductRequest;
import com.capstone.ecommerce.platform.product.dtos.ProductDto;
import com.capstone.ecommerce.platform.product.dtos.ProductUpdateRequest;
import com.capstone.ecommerce.platform.product.models.Product;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}