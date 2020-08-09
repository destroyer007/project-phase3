package com.shubham.learn.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shubham.learn.model.IpoModelDto;

@FeignClient("project-ipo")
public interface IpoClient {
	
	@RequestMapping(value = "/ipo-service/ipo",method = RequestMethod.GET)
	public Iterable<IpoModelDto> getAllIpo();

//	@RequestMapping(value = "/ipo-service/ipo/{id}",method = RequestMethod.GET)
//	public Optional<IpoModelDto> getById(@PathVariable Integer id);

	
	@RequestMapping(value = "/ipo-service/ipo",method = RequestMethod.POST)
	public IpoModelDto addIpo(@RequestBody IpoModelDto ipoModelDto);

	@RequestMapping(value = "/ipo-service/ipo/name/{cname}",method = RequestMethod.GET)
	public Iterable<IpoModelDto> getIpoByCompany(@PathVariable String cname);
}
