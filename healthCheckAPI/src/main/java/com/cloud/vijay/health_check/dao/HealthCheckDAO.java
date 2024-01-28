package com.cloud.vijay.health_check.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class HealthCheckDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	public Boolean isDBConnected() {
		try {
			System.out.println("hello1");
			entityManager.createQuery("SELECT 1").getResultList();
			System.out.println("hello2");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
