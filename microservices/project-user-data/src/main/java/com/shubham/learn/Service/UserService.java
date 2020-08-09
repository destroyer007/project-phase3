package com.shubham.learn.Service;

import com.shubham.learn.model.UserModel;
import com.shubham.learn.modelDto.UserModelDto;

public interface UserService {
	public UserModelDto addUser(UserModelDto userModelDto);
	public Iterable<UserModel> getAll();
//	public UserModel findByUserName(String userName);
}
