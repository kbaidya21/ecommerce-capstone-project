package com.capstone.ecommerce.platform.com.auth.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "Field is Blank | Invalid credentials")
    private String username;

    @NotBlank(message = "Field is Blank | Invalid credentials")
    private String password;
}
