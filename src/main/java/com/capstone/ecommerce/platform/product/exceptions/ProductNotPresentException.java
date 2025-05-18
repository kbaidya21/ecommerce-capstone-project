package com.capstone.ecommerce.platform.product.exceptions;

public class ProductNotPresentException extends  Throwable{
    public ProductNotPresentException(String message) {
        super(message);
    }
}
