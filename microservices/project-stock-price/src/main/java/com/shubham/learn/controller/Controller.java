package com.shubham.learn.controller;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.learn.model.StockPrice;
import com.shubham.learn.modelDto.StockPriceDto;
import com.shubham.learn.stockService.StockService;


@RestController
@RequestMapping("/stock-price")
public class Controller {
	@Autowired
	private StockService stockService;
	
//	@RequestMapping(value = "/stocks",method = RequestMethod.POST)
//	public StockPrice addStock(@RequestBody StockPriceDto stockPriceDto) {
//		return stockService.addStock(stockPriceDto);
//		
//	}
	@RequestMapping(value = "/stocks",method = RequestMethod.POST)
	public StockPriceDto addStock(@RequestBody StockPriceDto stockPriceDto) {
		return stockService.addStock(stockPriceDto);
		
	}
	
	@RequestMapping(value = "/stocks/{id}",method = RequestMethod.GET)
	public StockPriceDto getStockById(@PathVariable Integer id) {
		return stockService.getStockById(id);
	}
	

	@GetMapping("/stocks")
	public Iterable<StockPriceDto> getAll() {
		return stockService.getAll();
	}
	
	
	
}
