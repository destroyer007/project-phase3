package com.shubham.learn.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shubham.learn.model.CompanyModelDto;

@FeignClient("project-company")
public interface CompanyClient {
	
//	@RequestMapping(value = "/company-service/company/{id}",method = RequestMethod.GET)
//	public CompanyModelDto  getCompanyDetail(@PathVariable Integer id);

	@RequestMapping(value = "/company-service/company", method = RequestMethod.POST)
	public CompanyModelDto create(@RequestBody CompanyModelDto companyModelDto);

	@RequestMapping(value = "/company-service/company",method = RequestMethod.GET)
	public Iterable<CompanyModelDto> getAll();

//	@RequestMapping(value = "/company-service/company/name/{cname}",method = RequestMethod.GET)
//	public Iterable<CompanyModelDto> getCompany(@PathVariable String cname);
//
//	@RequestMapping(value="/company-service/company/pattern/{pattern}",method = RequestMethod.GET)
//	public Iterable<CompanyModelDto> getMatching(@PathVariable String pattern);

}
