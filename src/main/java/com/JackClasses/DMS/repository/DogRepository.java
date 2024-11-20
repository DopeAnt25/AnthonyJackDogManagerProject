package com.JackClasses.DMS.repository;
/**
 * @author Anthony Jack
 */
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.JackClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
