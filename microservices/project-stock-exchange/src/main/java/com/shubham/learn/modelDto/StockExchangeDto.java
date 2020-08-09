package com.shubham.learn.modelDto;

import lombok.Data;

@Data
public class StockExchangeDto {

//	private long id;
	private long exchangeId;
	private String stockExchange;
	private String contactAddress;
	private String brief;
	private String remark;
}
