package com.shubham.learn.Service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.learn.dao.UserRepository;
import com.shubham.learn.model.UserModel;
import com.shubham.learn.modelDto.UserModelDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserModelDto addUser(UserModelDto userModelDto) {

		ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserModel userModel = mapper.map(userModelDto,UserModel.class);
		return mapper.map(userRepository.save(userModel),UserModelDto.class);		
	}

	@Override
	public Iterable<UserModel> getAll() {
		return userRepository.findAll();
		
	}

//	@Override
//	public UserModel findByUserName(String userName) {
//		return userRepository.findByuserName(userName);
////		retrun userRepository.findByI
//		
//	}

}
