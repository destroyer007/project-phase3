package com.shubham.learn.exchangeService;

import org.springframework.stereotype.Service;

import com.shubham.learn.modelDto.StockExchangeDto;

@Service
public interface ExchangeService {
	public StockExchangeDto addExchange(StockExchangeDto stockExchangeDto);
	public Iterable<StockExchangeDto> getAllExchange();
	public StockExchangeDto getExchangeById(long id);

}
