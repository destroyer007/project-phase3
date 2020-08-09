package com.shubham.learn.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shubham.learn.model.StockExchangeDto;

@FeignClient("project-stock-exchange")
public interface StockExchangeClient {
	
	@PostMapping("/exchange-service/exchanges")
	public StockExchangeDto addExchange(@RequestBody StockExchangeDto stockExchangeDto);

	
	@GetMapping("/exchange-service/exchanges")
	public Iterable<StockExchangeDto> getAll() ;

	@GetMapping("/exchange-service/exchanges/{id}")
	public StockExchangeDto getByExchangeId(@PathVariable long id);
}
