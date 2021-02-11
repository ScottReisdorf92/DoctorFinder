package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Specialty;

@Repository
public interface SpecialtyRepo extends CrudRepository<Specialty, Integer>{

}
