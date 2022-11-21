package com.program.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.entity.Employee;
import com.program.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	public void addEmployee(Employee e) {
		repo.save(e);
	}
}
