package com.simulator.fed.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sample_table")
public class SampleEntity {

	@Id
	private int id;
	
	private String name;
}
