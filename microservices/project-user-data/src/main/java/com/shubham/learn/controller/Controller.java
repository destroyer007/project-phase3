package com.shubham.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.learn.Service.UserService;
import com.shubham.learn.model.UserModel;
import com.shubham.learn.modelDto.UserModelDto;

@RestController
@RequestMapping("/user-service")
public class Controller {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/users",method = RequestMethod.POST)
	public UserModelDto addUser(@RequestBody UserModelDto userModelDto) {
		return userService.addUser(userModelDto);
	}
	

	@RequestMapping(value = "/users",method = RequestMethod.GET)
	public Iterable<UserModel> getAll() {
		return userService.getAll();
	}


//	@RequestMapping(value = "/users/name/{userName}",method = RequestMethod.GET)
//	public UserModel getByName(@PathVariable String userName) {
//		return userService.findByUserName(userName);
//		}
}
