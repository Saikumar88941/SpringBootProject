package com.MangaClasses.DMS.repository;
import java.util.List;
import java.util.List;

/*
 * 
 * @s559158 (Manag Saikumar)
 * 
 * 
 */
import org.springframework.data.repository.CrudRepository;

import com.MangaClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
