package com.ibm.mysqldemo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.mysqldemo.entity.User;
import com.ibm.mysqldemo.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService userService;

	@PostMapping("/user")
	int createUser(@RequestBody User user) {
		return userService.save(user);
	}
	@GetMapping("/user")
	List<User> getUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/user/{id}")
	Optional<User> getUser(@PathVariable("id") Integer userId){
		return userService.getUser(userId);
	}
	
	private void validateModel(Errors bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Something went wrong.Please Retry!!");}
		}
	
	@PutMapping("/user/{id}")
	void updateEmployeeDetails(@RequestBody @Valid User user, BindingResult bindingResult,@PathVariable("id") Integer userId) {
		validateModel(bindingResult);
		user.setId(userId);
		userService.updateUser(user);
	}
	@DeleteMapping("/user/{id}")
	void deleteUser(@PathVariable("id")Integer userId) {
		userService.deleteUser(userId);
	}

}
