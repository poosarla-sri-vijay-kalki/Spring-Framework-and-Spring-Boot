package com.example.springJDBCDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springJDBCDemo.model.Alien;
import com.example.springJDBCDemo.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcApplication.class, args);
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("vijay");
		alien1.setTech("JAVA");
		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);
		System.out.println(repo.findAll().toString());
	}

}
