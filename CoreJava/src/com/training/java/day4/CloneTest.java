package com.training.java.day4;

public class CloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer customer =new Customer();
		customer.setName("Goyal");
		customer.setLocation("Bangalore");
		// Getting cloned copy
		Customer c1=customer.clone();
		System.out.println(" name :"+c1.getName());
		System.out.println(" location :"+c1.getLocation());
		c1.setName("Kumar");
		System.out.println(" name after changing clone  :"+customer.getName());
		
		// Using reference copy
		Customer c2=customer;
		c2.setName("Kumar");
		System.out.println(" name after using reference :"+customer.getName());
	}
}

 class Customer  implements Cloneable{
	 String name;
	 String location;
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public Customer clone (){
		Customer c1=null;
		try {
			 c1=(Customer)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c1;
	}
 }