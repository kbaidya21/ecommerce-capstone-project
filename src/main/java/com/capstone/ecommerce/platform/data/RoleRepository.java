package com.capstone.ecommerce.platform.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.platform.usermanagement.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String role);
}