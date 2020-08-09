package com.shubham.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.learn.modelDto.CompanyModelDto;
import com.shubham.learn.service.CompanyService;

@RestController
@RequestMapping("/company-service")
public class Controller {
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/company/{id}",method = RequestMethod.GET)
	public CompanyModelDto  getCompanyDetail(@PathVariable Integer id) {
		return companyService.findById(id);
	}
	
	@RequestMapping(value = "/company", method = RequestMethod.POST)
	public CompanyModelDto create(@RequestBody CompanyModelDto companyModelDto) {
		return companyService.create(companyModelDto);
	}
	
	@RequestMapping(value = "/company",method = RequestMethod.GET)
	public Iterable<CompanyModelDto> getAll() {
		return companyService.getAll();
	}
	
	@RequestMapping(value = "/company/name/{cname}",method = RequestMethod.GET)
	public Iterable<CompanyModelDto> getCompany(@PathVariable String cname) {
		return companyService.getCompany(cname);
	}
	
	@RequestMapping(value="/company/pattern/{pattern}",method = RequestMethod.GET)
	public Iterable<CompanyModelDto> getMatching(@PathVariable String pattern) {
		return companyService.getMatching(pattern);
	}
	
}
