package com.shubham.learn.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.learn.model.IpoModel;
import com.shubham.learn.modelDto.IpoModelDto;
import com.shubham.learn.service.IpoService;

@RestController
@RequestMapping("/ipo-service")
public class Controller {
	@Autowired
	private IpoService ipoService;
	
	@RequestMapping(value = "/ipo",method = RequestMethod.GET)
	public Iterable<IpoModelDto> getAllIpo() {
		return ipoService.getAll();
	}
	
	@RequestMapping(value = "/ipo/{id}",method = RequestMethod.GET)
	public Optional<IpoModel> getById(@PathVariable Integer id) {
		return ipoService.getIpoById(id);
	}
	
	@RequestMapping(value = "/ipo",method = RequestMethod.POST)
	public IpoModelDto addIpo(@RequestBody IpoModelDto ipoModelDto) {
		return ipoService.addIpo(ipoModelDto);
	}
	@RequestMapping(value = "/ipo/name/{cname}",method = RequestMethod.GET)
	public Iterable<IpoModelDto> getIpoByCompany(@PathVariable String cname) {
		return ipoService.getIpoByCompany(cname);
	}
	
}
