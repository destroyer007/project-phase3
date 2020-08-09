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
@Table(name="IpoModel")
public class IpoModel {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "Id")
	@Id
	private Integer id;
	
	@Column(name= "CompanyId")
	private Integer Companyid;
	
	
	@Column(name= "CompanyName")
	private String companyName;
	
	@Column(name= "StockExchange")
	private String stockExchange;
	
	@Column(name= "PricePerShare")
	private long pricePerShare;
	
	@Column(name= "TotalShare")
	private long totalShare;
	
	@Column(name= "OpeningDateTime")
	private String openDateTime;
	
	@Column(name= "Remark")
	private String remark;
	
	
}
