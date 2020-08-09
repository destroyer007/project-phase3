 package com.shubham.learn.model;


import lombok.Data;

@Data
public class UserModelDto {
//	private long id;
	private String userName;
	private String password;
	private String userType;
	private String email;
	private String mobileNo;
	private String status;
}
