package com.shubham.learn.stockServiceImpl;

import java.util.ArrayList;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.learn.dao.StockRepository;
import com.shubham.learn.model.StockPrice;
import com.shubham.learn.modelDto.StockPriceDto;
import com.shubham.learn.stockService.StockService;

@Service
public class StockServiceImpl implements StockService{
	@Autowired
	private StockRepository stockRepository;
	
	

	@Override
	public StockPriceDto addStock(StockPriceDto stockPriceDto) {
		ModelMapper mapper=new ModelMapper();
      mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
      StockPrice stockPrice=mapper.map(stockPriceDto,StockPrice.class);
		return mapper.map(stockRepository.save(stockPrice),StockPriceDto.class);
		
	}

	@Override
	public StockPriceDto getStockById(Integer id) {
		ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
       StockPrice stockPrice=stockRepository.findById(id).get();
//        Optional<StockPrice> stockPrice=stockRepository.findById(id);
        
		return  mapper.map(stockPrice,StockPriceDto.class);
		
	}

	

	public Iterable<StockPriceDto> getAll() {
		ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
       Iterable<StockPrice> listStockPrice= stockRepository.findAll();
       Iterable<StockPriceDto> listStockPriceDto = new  ArrayList<StockPriceDto>();
       for(StockPrice stockPrice : listStockPrice) {
    	   ((ArrayList<StockPriceDto>) listStockPriceDto).add(mapper.map(stockPrice,StockPriceDto.class));
       }
       return listStockPriceDto;
       
	}




}
	

