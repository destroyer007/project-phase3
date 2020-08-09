package com.shubham.learn.model;

import lombok.Data;

@Data
public class IpoModelDto {
	private Integer id;
	private Integer Companyid;
	private String companyName;
	private String stockExchange;
	private long pricePerShare;
	private long totalShare;
	private String openDateTime;
	private String remark;
	
}
