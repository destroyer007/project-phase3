package com.shubham.learn.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shubham.learn.model.UserModel;
import com.shubham.learn.model.UserModelDto;

@FeignClient("project-user-data")
public interface UserClient {
	@RequestMapping(value = "/user-service/users",method = RequestMethod.POST)
	public UserModelDto addUser(@RequestBody UserModelDto userModel);	

	@RequestMapping(value = "/user-service/users",method = RequestMethod.GET)
	public Iterable<UserModel> getAll();


}
