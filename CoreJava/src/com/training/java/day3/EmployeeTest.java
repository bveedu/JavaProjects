package com.training.java.day3;

import java.util.Date;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date =new java.util.Date();
		date.setDate(1);
		date.setMonth(11);
		date.setYear(1991);
		/*Manager manager= new Manager("Kumar",1000,date);
		manager.setDepartment("Finance");
		System.out.println("Department of manager is "+manager.getDepartment());
		System.out.println(manager.getString());
		manager.printMe();
		Employee employee =new Employee("Ram",1000,date);
		employee.printMe();
		employee.printMe("Hello !");*/
		// Polymorphism example
		
		Employee e1= new Manager("Singh",10000,date);
		
		System.out.println(e1.getString());
		Manager m1=new Manager(" Ram",10000,date);
		m1.setDepartment("IT");
		e1=m1;
		System.out.println(e1.getString());
		Engineer eng1 =new Engineer("John",9000,date);
		eng1.setProject("Automation");
		e1=eng1;
		System.out.println(e1.getString());
	}

}
