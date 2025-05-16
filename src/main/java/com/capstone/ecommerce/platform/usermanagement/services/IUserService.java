package com.capstone.ecommerce.platform.usermanagement.services;

import com.capstone.ecommerce.platform.usermanagement.dtos.CreateUserRequestDto;
import com.capstone.ecommerce.platform.usermanagement.dtos.ResetPasswordRequestDto;
import com.capstone.ecommerce.platform.usermanagement.dtos.UserDto;
import com.capstone.ecommerce.platform.usermanagement.dtos.UserUpdateRequestDto;
import com.capstone.ecommerce.platform.usermanagement.models.User;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequestDto request);
    User updateUser(UserUpdateRequestDto request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();

    void resetPassword(ResetPasswordRequestDto resetPasswordRequestDto);
}