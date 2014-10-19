package com.training.java.day3;

import java.util.Date;

public class Engineer  extends Employee{

	String project; 
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Engineer(String name, int salary, Date dateOfBirth) {
		super(name, salary, dateOfBirth);
	}
	public String getString(){
		return(super.getString()+" with project "+getProject());
	}
}
