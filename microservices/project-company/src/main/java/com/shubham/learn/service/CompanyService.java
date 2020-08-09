package com.shubham.learn.service;

import com.shubham.learn.modelDto.CompanyModelDto;


public interface CompanyService {
	public CompanyModelDto findById(Integer id);
	public CompanyModelDto create(CompanyModelDto companyModelDto);
	public Iterable<CompanyModelDto> getAll();
	public Iterable<CompanyModelDto> getMatching(String pattern);
	public Iterable<CompanyModelDto> getCompany(String name);
}
