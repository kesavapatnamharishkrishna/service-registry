package com.harish.www.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController 
{
	
	@GetMapping("/list")
	public List<String> getAllProducts()
	{
		return List.of("Laptop","Mobile","HeadPhones");
	}

}
