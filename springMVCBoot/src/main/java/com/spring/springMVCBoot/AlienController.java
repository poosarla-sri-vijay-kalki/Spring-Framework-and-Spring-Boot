package com.spring.springMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AlienController {
	
	@GetMapping("aliens")
	public String getAliens() {
		return "i";
	}
	
}
