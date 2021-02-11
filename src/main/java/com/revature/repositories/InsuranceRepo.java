package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Insurance;

@Repository
public interface InsuranceRepo extends CrudRepository<Insurance, Integer> {

}
