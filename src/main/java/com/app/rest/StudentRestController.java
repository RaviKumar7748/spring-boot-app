package com.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
	
	@GetMapping("/{name}")
	public String getMessage(@PathVariable String name) {
      return "<h1> Your Name is   </h1> "+name;
	}

}
