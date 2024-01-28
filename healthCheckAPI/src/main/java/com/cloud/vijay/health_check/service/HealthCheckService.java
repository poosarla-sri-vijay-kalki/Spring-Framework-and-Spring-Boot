package com.cloud.vijay.health_check.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloud.vijay.health_check.dao.HealthCheckDAO;

@Service
public class HealthCheckService {
	
	@Autowired
	private HealthCheckDAO healthCheckDAO;
	
	@Transactional
	public Boolean isDBConnected() {
		return healthCheckDAO.isDBConnected();
		
	}
	
}
