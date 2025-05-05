package com.capstone.ecommerce.platform.com.capstone.ecommerce.platform.usermanagement.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResetPasswordRequestDto {
    private String email;
    private String newPassword;
    private String confirmPassword;
}
