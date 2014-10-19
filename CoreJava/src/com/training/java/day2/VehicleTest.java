package com.training.java.day2;

public class VehicleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle("Car");
		v1.setName("Bike");
		v1.setLoadLimit(10);
		System.out.println(" Name of the vehicle is :"+v1.getName());
		System.out.println(" Loadlimit of the vehicle is :"+v1.getLoadLimit());

	}

}
