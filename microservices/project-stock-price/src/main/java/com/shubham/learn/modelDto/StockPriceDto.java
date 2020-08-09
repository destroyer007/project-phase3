package com.shubham.learn.modelDto;

import lombok.Data;


@Data

public class StockPriceDto {
	
//		private Integer id;

		private Integer companyId;

		private String stockExchange;

		private long CurrentPrice;

		private String date;
		
		private String time;
		
	}

