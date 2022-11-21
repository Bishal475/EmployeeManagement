package com.program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.program.entity.Employee;
import com.program.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/add_employee")
	public String addEmployeeForm() {
		return "add_employee";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e) {
		System.out.println(e);
		service.addEmployee(e);
		return "redirect:/";
	}

}
