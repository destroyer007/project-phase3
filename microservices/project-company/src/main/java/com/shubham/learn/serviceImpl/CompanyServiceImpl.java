package com.shubham.learn.serviceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.learn.dao.CompanyRepository;
import com.shubham.learn.model.CompanyModel;
import com.shubham.learn.modelDto.CompanyModelDto;
import com.shubham.learn.service.CompanyService;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public Iterable<CompanyModelDto> getAll() {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Iterable< CompanyModel> listModel = companyRepository.findAll();
		Iterable< CompanyModelDto> listModelDto = new ArrayList<CompanyModelDto>();
		for(CompanyModel model : listModel) {
			((ArrayList<CompanyModelDto>) listModelDto).add(mapper.map(model,CompanyModelDto.class));
		}
		return listModelDto;
	}
	
	public CompanyModelDto findById(Integer id) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Optional<CompanyModel> companyModel = companyRepository.findById(id);
		CompanyModelDto companyModelDto=mapper.map(companyModel,CompanyModelDto.class);
		return companyModelDto;
	}

	@Override
	public CompanyModelDto create(CompanyModelDto companyModelDto) {

		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CompanyModel companyModel = mapper.map(companyModelDto,CompanyModel.class);
		return mapper.map(companyRepository.save(companyModel),CompanyModelDto.class);
		
	}
	
	public Iterable<CompanyModelDto> getMatching(String pattern){
		
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Iterable< CompanyModel> listModel = companyRepository.findBycompanyNameContaining(pattern);
		Iterable< CompanyModelDto> listModelDto = new ArrayList<CompanyModelDto>();
		for(CompanyModel model : listModel) {
			((ArrayList<CompanyModelDto>) listModelDto).add(mapper.map(model,CompanyModelDto.class));
		}
		return listModelDto;
	}

	public Iterable<CompanyModelDto> getCompany(String name) {
		
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Iterable< CompanyModel> listModel = companyRepository.findBycompanyName(name);
		Iterable< CompanyModelDto> listModelDto = new ArrayList<CompanyModelDto>();
		for(CompanyModel model : listModel) {
			((ArrayList<CompanyModelDto>) listModelDto).add(mapper.map(model,CompanyModelDto.class));
		}
		return listModelDto;
	}
}
