package com.ibm.mysqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.mysqldemo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
