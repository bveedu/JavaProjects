package com.training.java.day2;

import java.util.Date;

import com.training.java.day3.Employee;

public class Manager extends Employee {
private String department;
public String getDepartment() {
	System.out.println(super.dateOfBirth);
	return department;
	
}
public void setDepartment(String department) {
	this.department = department;
}
public Manager(String name, int salary, Date dateOfBirth) {
	super(name, salary, dateOfBirth);
}
}
