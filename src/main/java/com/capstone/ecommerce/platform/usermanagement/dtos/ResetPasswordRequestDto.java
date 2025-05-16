package com.capstone.ecommerce.platform.usermanagement.dtos;

import lombok.Data;

@Data
public class ResetPasswordRequestDto {

	private String email;
	private String newPassword;
	private String confirmPassword;
}
