package com.shubham.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.learn.model.StockPrice;

@Repository
public interface StockRepository extends JpaRepository<StockPrice, Integer> {

}
