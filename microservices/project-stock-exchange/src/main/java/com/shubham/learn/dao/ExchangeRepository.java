package com.shubham.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.learn.model.StockExchange;

@Repository
public interface ExchangeRepository extends JpaRepository<StockExchange, Long> {
	

	public StockExchange findByexchangeId(long exchangeId);
}
