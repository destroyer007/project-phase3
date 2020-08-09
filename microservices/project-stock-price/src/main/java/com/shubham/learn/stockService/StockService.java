package com.shubham.learn.stockService;

import java.util.Optional;

import com.shubham.learn.model.StockPrice;
import com.shubham.learn.modelDto.StockPriceDto;

public interface StockService {
	public StockPriceDto getStockById(Integer id);
	public Iterable<StockPriceDto> getAll();
	StockPriceDto addStock(StockPriceDto stockPriceDto);
}
