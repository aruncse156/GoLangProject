package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value = "get", method = RequestMethod.GET)
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	@RequestMapping(value = "get/id", method = RequestMethod.GET)
	public List<User> getFewUsers(@RequestParam("ids") List<Long> ids){
		
		return userRepo.findAllById(ids);
	}
}
