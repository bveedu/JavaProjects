package com.training.java.day3;

import java.util.Date;

public class Employee {
private String name;
private int salary;
protected Date dateOfBirth;

public Employee(String name, int salary, Date dateOfBirth) {
super();
this.name = name;
this.salary = salary;
this.dateOfBirth = dateOfBirth;
}
public void printMe(){
	System.out.println(" I am "+name+ " with date of birth "+dateOfBirth);
}
public void printMe(String message){
	System.out.print(message);
	System.out.println("  I am "+name+ " with date of birth "+dateOfBirth);
}
Object getString(){
	return(" I am "+name+ " with date of birth "+dateOfBirth);
}

}

