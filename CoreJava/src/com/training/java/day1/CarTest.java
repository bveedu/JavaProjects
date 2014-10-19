package com.training.java.day1;

import com.training.java.day2.Car;

public class CarTest {
	
	public static void main(String [] args){

    	Car c1=new Car("Indica");
    	Car c2=new Car("Swift");
    	Car c3=new Car("Alto");
    	Car c4=new Car("nano");
    	
    	System.out.println("Id of c4 is :"+c4.getID());
    	System.out.println(" No of cars :"+Car.getNumberOfCars());
    	c1.model="Ind";
    	System.out.println("Model of c1 :"+c1.model);
    }
}
