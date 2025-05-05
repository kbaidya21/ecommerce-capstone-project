package com.capstone.ecommerce.platform.com.capstone.ecommerce.platform.usermanagement.dtos;

import com.capstone.ecommerce.platform.com.capstone.ecommerce.platform.usermanagement.models.Role;
import lombok.Data;

import java.util.Collection;

@Data
public class CreateUserRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Collection<Role> roles;
}