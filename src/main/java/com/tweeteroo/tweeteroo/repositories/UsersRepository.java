package com.tweeteroo.tweeteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweeteroo.tweeteroo.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);
}
