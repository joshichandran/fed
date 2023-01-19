package com.simulator.fed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simulator.fed.model.SampleEntity;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Integer> {

	
}
