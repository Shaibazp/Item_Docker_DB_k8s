package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuRepository;

@RestController
@RequestMapping("/menu")
public class MenuController 
{
	@Autowired
	MenuRepository menuRepository;
	
	@GetMapping
	public List<Menu> getOrders(){
		return menuRepository.findAll();
	}
	
	@GetMapping("/{category}")
	public List<Menu> getOrdersByCategory(@PathVariable("category") String category){
		return menuRepository.findByCategory(category);
	}
}
