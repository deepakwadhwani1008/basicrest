package com.test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test1.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
