package com.revature.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.revature")
@EnableJpaRepositories("com.revature.repositories")
@EntityScan("com.revature.entities")
<<<<<<< HEAD
=======

>>>>>>> 629809b5a3d2309c5a8d0b967754cf965a5bc80f
public class Project2DfApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2DfApplication.class, args);
	}

}
