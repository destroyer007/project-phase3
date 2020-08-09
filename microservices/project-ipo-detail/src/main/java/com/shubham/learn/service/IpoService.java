package com.shubham.learn.service;

import java.util.Optional;

import com.shubham.learn.model.IpoModel;
import com.shubham.learn.modelDto.IpoModelDto;

public interface IpoService {
	public Iterable<IpoModelDto> getAll();
	public IpoModelDto addIpo(IpoModelDto ipomodelDto);
	public Optional<IpoModel> getIpoById(Integer id);
	public Iterable<IpoModelDto> getIpoByCompany(String cname);

}
