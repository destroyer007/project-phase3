package com.shubham.learn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userDetail")
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private long id;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "UserType")
	private String userType;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "MobileNo")
	private String mobileNo;
	
	@Column(name = "Status")
	private String status;
	

}
