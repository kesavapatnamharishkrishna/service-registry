package com.harish.www.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController 
{
	@GetMapping("all")
	public List<String> getAllOrders()
	{
		return List.of("order1","order2","order3");
	}

}
