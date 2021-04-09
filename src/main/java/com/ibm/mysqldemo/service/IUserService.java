package com.ibm.mysqldemo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.ibm.mysqldemo.entity.User;

public interface IUserService {

	int save(User user);

	List<User> getUsers();

	Optional<User> getUser(Integer userId);

	void deleteUser(Integer userId);

	void updateUser(@Valid User user);

}