package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Practice;

@Repository
public interface PracticeRepo extends CrudRepository<Practice, Integer>{

}
