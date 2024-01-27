package com.spring.springMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public void home() {
		System.out.println("home page REquested  ");
	}
	
	@RequestMapping("add")
	public void add(@RequestParam("num1") int i, @RequestParam("num2") int j,HttpSession session, Model m) {
		// session is already created by spring 
		System.out.println("lol");
		System.out.println(i+j);
	}
}
