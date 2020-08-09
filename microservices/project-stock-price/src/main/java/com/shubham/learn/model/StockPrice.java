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
@Table(name = "stockPrices")
public class StockPrice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="companyId")
	private Integer companyId;
	
	@Column(name="stckExchange")
	private String stockExchange;
	
	@Column(name="currentPrice")
	private long CurrentPrice;
	
	@Column(name="Date")
	private String date;
	
	@Column(name="Time")
	private String time;
	
}
