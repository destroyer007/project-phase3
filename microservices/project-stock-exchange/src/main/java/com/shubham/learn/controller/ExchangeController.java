package com.shubham.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.learn.exchangeService.ExchangeService;
import com.shubham.learn.modelDto.StockExchangeDto;

@RestController
@RequestMapping("/exchange-service")
public class ExchangeController {
	
	@Autowired
	private ExchangeService exchangeService;
	
	@PostMapping("/exchanges")
	public StockExchangeDto addExchange(@RequestBody StockExchangeDto stockExchangeDto) {
		return exchangeService.addExchange(stockExchangeDto);
		
	}
	
	@GetMapping("/exchanges")
	public Iterable<StockExchangeDto> getAll() {
		return exchangeService.getAllExchange();
	}
	
	@GetMapping("/exchanges/{id}")
	public StockExchangeDto getByExchangeId(@PathVariable long id) {
		return exchangeService.getExchangeById(id);
	}
	
	

}
