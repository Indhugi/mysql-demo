package com.ibm.mysqldemo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.mysqldemo.entity.User;
import com.ibm.mysqldemo.repo.UserRepository;
@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public int save(User user) {
		User savedUser=userRepository.save(user);
		return savedUser.getId();
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUser(Integer userId) {
		return userRepository.findById(userId);
	}

	@Override
	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);;
	}

	@Override
	public void updateUser(@Valid User user) {
		userRepository.save(user);
	}

	

}
