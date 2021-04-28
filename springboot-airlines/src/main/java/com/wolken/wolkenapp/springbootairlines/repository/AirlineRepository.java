package com.wolken.wolkenapp.springbootairlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wolken.wolkenapp.springbootairlines.entity.AirlinesEntity;

@Repository
public interface AirlineRepository extends JpaRepository<AirlinesEntity , Integer>{
	public AirlinesEntity findByAirlinesName(String airlinesName);
	public  AirlinesEntity findByCountry(String country);
	public void deleteByAirlinesName(String airlinesName);

}
