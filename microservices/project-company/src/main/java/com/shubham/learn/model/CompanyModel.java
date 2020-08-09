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
@Table(name="comapny")
public class CompanyModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Companyid")
	private long companyId;
	
	@Column(name = "cname")
	private String  companyName;
	
	@Column(name = "turnOver")
	private float turnover;
	
	@Column(name = "ceo")
	private String ceo;
	
	@Column(name = "sector")
	private String sector;
	
	@Column(name = "about")
	private String about;
	
	@Column(name = "ipoDate")
	private String ipoDate;
}
