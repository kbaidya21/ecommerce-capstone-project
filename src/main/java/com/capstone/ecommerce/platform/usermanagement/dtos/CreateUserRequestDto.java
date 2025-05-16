package com.capstone.ecommerce.platform.usermanagement.dtos;

import java.util.Collection;

import com.capstone.ecommerce.platform.usermanagement.models.Role;

import lombok.Data;

@Data
public class CreateUserRequestDto {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Collection<Role> roles;

}