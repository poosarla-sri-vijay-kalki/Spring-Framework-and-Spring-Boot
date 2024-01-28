package com.cloud.vijay.health_check.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cloud.vijay.health_check.service.HealthCheckService;

import jakarta.servlet.http.HttpServletResponse;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class HealthCheckController {

	@Autowired
	private HealthCheckService healthCheckService; 
	
	@GetMapping("/healthz")
	public void checkDBConection(@RequestBody(required = false) String requestBody, HttpServletResponse response) {
		
		if (requestBody != null && !requestBody.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
		
		try {
			healthCheckService.isDBConnected();
		}catch(Exception e) {
			response.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
			e.printStackTrace();

		}
		setHeaders(response);
	}
	
	@RequestMapping("/healthz")
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	public void unSupportedMethods(HttpServletResponse response) {
		setHeaders(response);
	}
	
	
	public void setHeaders(HttpServletResponse response) {
		response.setHeader("cache-control", "no-cache, no-store, must-revalidate;");
		response.setHeader(" X-Content-Type-Options", "nosniff");
		response.setHeader("Pragma","no-cache");
	}
	

	
}
