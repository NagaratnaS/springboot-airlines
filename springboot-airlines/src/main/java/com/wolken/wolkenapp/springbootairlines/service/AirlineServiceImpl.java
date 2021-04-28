package com.wolken.wolkenapp.springbootairlines.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wolken.wolkenapp.springbootairlines.entity.AirlinesEntity;
import com.wolken.wolkenapp.springbootairlines.repository.AirlineRepository;

@Service
@Transactional
public class AirlineServiceImpl implements AirlineService{
	
	@Autowired
	AirlineRepository repository;

	@Override
	public String validateAndSave(AirlinesEntity entity) {
		// TODO Auto-generated method stub
		if(entity != null) {
			if(!entity.getAirlinesName().equals(null) && !entity.getCountry().equals(null) && entity.getNoOfPlanes() > 0) {
				repository.save(entity);
				return "data added successfully";
			}
		}
		return "Data not added!!Error";
	}

	@Override
	public AirlinesEntity validateAndGetByName(String airlinesName) {
		// TODO Auto-generated method stub
		if(!airlinesName.equals(null)) {
			return repository.findByAirlinesName(airlinesName);
		}
		return null;
	}

	@Override
	public String validateAndUpdateByCountry(AirlinesEntity entity) {
		// TODO Auto-generated method stub
		if(entity != null) {
			if(!entity.getAirlinesName().equals(null) && !entity.getCountry().equals(null) && entity.getNoOfPlanes() > 0) {
				AirlinesEntity updatingentity = repository.findByCountry(entity.getCountry());
				updatingentity.setAirlinesName(entity.getAirlinesName());
				updatingentity.setCountry(entity.getCountry());
				updatingentity.setNoOfPlanes(entity.getNoOfPlanes());
				repository.save(updatingentity);
				return "data updated successfully";
				
			}
			
		}
		return "some error occured";
	}

	@Override
	public String validateAndDeleteByName(String airlinesName) {
		// TODO Auto-generated method stub
		if(!airlinesName.equals(null)) {
		repository.deleteByAirlinesName(airlinesName);
		return "deleted successfully";
		}
		return "not deleted!!Error";
	}

}
