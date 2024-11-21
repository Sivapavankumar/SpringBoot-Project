package com.balayya.DMS.repository;

import java.util.List;

/*
 * @author S570402 Siva Pavan Kumar Chava
 */

import org.springframework.data.repository.CrudRepository;

import com.balayya.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);

}
