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
@Table(name = "stockExchange")
public class StockExchange {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private long id;
	
	@Column(name = "ExchangeId")
	private long exchangeId;
	
	@Column(name = "StockExchange")
	private String stockExchange;
	
	@Column(name = "ContactAddress")
	private String contactAddress;
	
	@Column(name = "Brief")
	private String brief;
	
	@Column(name = "Remark")
	private String remark;
	

}
