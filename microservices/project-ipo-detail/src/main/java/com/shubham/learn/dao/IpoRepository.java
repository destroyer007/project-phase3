package com.shubham.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.learn.model.IpoModel;

@Repository
public interface IpoRepository extends JpaRepository<IpoModel, Integer>{
	Iterable<IpoModel> findByCompanyName(String cname);

}
