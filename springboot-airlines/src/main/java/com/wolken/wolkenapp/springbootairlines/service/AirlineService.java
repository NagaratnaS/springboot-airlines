package com.wolken.wolkenapp.springbootairlines.service;

import com.wolken.wolkenapp.springbootairlines.entity.AirlinesEntity;

public interface AirlineService {
	public  String validateAndSave(AirlinesEntity entity);
	public AirlinesEntity validateAndGetByName(String airlinesName);
	public String validateAndUpdateByCountry(AirlinesEntity entity);
	public String validateAndDeleteByName(String airlinesName);

}
