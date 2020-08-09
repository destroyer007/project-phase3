package com.shubham.learn.serviceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.learn.dao.IpoRepository;
import com.shubham.learn.model.IpoModel;
import com.shubham.learn.modelDto.IpoModelDto;
import com.shubham.learn.service.IpoService;

@Service

public class ServiceImpl implements IpoService{
	@Autowired
	private IpoRepository ipoRepository;

	@Override
	public IpoModelDto addIpo(IpoModelDto ipoModelDto) {
		
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		IpoModel ipoModel = mapper.map(ipoModelDto, IpoModel.class);
		return mapper.map(ipoRepository.save(ipoModel), IpoModelDto.class) ;
	}

	@Override
	public Optional<IpoModel> getIpoById(Integer id) {
		return ipoRepository.findById(id);
	}

	@Override
	public Iterable<IpoModelDto>  getIpoByCompany(String cname) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Iterable<IpoModel> listModel = ipoRepository.findByCompanyName(cname);
		Iterable<IpoModelDto> listModelDto = new ArrayList<IpoModelDto>();
		for(IpoModel model : listModel) {
			((ArrayList<IpoModelDto>) listModelDto).add(mapper.map(model,IpoModelDto.class));
		}
		
		return listModelDto;
		
	}

	public Iterable<IpoModelDto> getAll() {
		
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Iterable< IpoModel> listModel = ipoRepository.findAll();
		Iterable<IpoModelDto> listModelDto = new ArrayList<IpoModelDto>();
		for(IpoModel model : listModel) {
			((ArrayList<IpoModelDto>) listModelDto).add(mapper.map(model,IpoModelDto.class));
		}
		return listModelDto;
	}
}
