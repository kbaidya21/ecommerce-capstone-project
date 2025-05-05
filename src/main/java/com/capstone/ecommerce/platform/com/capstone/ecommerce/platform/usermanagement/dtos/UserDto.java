package com.capstone.ecommerce.platform.com.capstone.ecommerce.platform.usermanagement.dtos;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}