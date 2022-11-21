package com.program.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_SYSTEM")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empnumber;
	private String name;
	private String position;
	private String number;
	private String email;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpnumber() {
		return empnumber;
	}

	public void setEmpNumber(int empnumber) {
		this.empnumber = empnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empnumber + ", name=" + name + ", position=" + position + ", number=" + number
				+ ", email=" + email + "]";
	}

	
}
