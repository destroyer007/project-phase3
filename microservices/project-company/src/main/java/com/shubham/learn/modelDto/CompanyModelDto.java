package com.shubham.learn.modelDto;

import lombok.Data;

@Data
public class CompanyModelDto {
	
	private Integer id;
	
	private long companyId;
	private String  companyName;
	private float turnover;
	private String ceo;
	private String sector;
	private String about;
	private String ipoDate;

}
