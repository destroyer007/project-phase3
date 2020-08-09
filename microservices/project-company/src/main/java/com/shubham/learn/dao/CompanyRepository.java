package com.shubham.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.learn.model.CompanyModel;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel,Integer>{
	

	Iterable<CompanyModel> findBycompanyNameContaining(String pattern);
	Iterable<CompanyModel> findBycompanyName(String cname);
	
}
