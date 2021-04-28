package com.wolken.wolkenapp.springbootairlines.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "airlines")
public class AirlinesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "airlinesID")
	private int airlinesID;
	@Column(name = "airlinesName")
	private String airlinesName;
	@Column(name = "country")
	private String country;
	@Column(name = "noOfPlanes")
	private int noOfPlanes;

}
