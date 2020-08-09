package com.shubham.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.learn.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
	public UserModel findByuserName(String userName);
}
