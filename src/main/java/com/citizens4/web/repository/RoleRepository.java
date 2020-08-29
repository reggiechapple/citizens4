package com.citizens4.web.repository;

import com.citizens4.web.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
    
}