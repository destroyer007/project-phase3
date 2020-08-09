package com.shubham.learn.exchangeServiceImpl;

import java.util.ArrayList;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.learn.dao.ExchangeRepository;
import com.shubham.learn.exchangeService.ExchangeService;
import com.shubham.learn.model.StockExchange;
import com.shubham.learn.modelDto.StockExchangeDto;


@Service
public class ExchangeServiceImpl implements ExchangeService{

	@Autowired
	private ExchangeRepository exchangeRepository;
	
	@Override
	public StockExchangeDto addExchange(StockExchangeDto stockExchangeDto) {
		
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		StockExchange stockExchange=mapper.map(stockExchangeDto,StockExchange.class);
		return mapper.map(exchangeRepository.save(stockExchange), StockExchangeDto.class);
		
	}

	@Override
	public Iterable<StockExchangeDto> getAllExchange() {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Iterable<StockExchangeDto> listDto = new  ArrayList<StockExchangeDto>();
		Iterable<StockExchange> listIterable = exchangeRepository.findAll();
		for(StockExchange model: listIterable) {
			((ArrayList<StockExchangeDto>) listDto).add(mapper.map(model, StockExchangeDto.class));
		}
		return listDto;
//		return exchangeRepository.findAll();
		
	}

	@Override
	public StockExchangeDto getExchangeById(long exchangeId) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper.map(exchangeRepository.findByexchangeId(exchangeId), StockExchangeDto.class);
		
	}

}
