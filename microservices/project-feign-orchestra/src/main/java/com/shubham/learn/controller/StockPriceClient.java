package com.shubham.learn.controller;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shubham.learn.model.StockPriceDto;

@FeignClient("project-stock-price")
public interface StockPriceClient {
	
	@RequestMapping(value = "/stock-price/stocks",method = RequestMethod.POST)
	public StockPriceDto addStock(@RequestBody StockPriceDto stockPriceDto);

	@RequestMapping(value = "/stock-price/stocks/{id}",method = RequestMethod.GET)
	public Optional<StockPriceDto> getStockById(@PathVariable Integer id);

	@GetMapping("/stock-price/stocks")
	public Iterable<StockPriceDto> getAll();
}
