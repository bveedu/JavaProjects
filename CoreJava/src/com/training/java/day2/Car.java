package com.training.java.day2;

public class Car {
	//Instance variable
		 String model;
	//Instance variable
	    private int id;
	//Class variable
	    private static int numberOfCars = 0;
	    public Car(String model){
	     this.model=model;
	        // increment number of Bicycles and assign ID number
	        id = ++numberOfCars;
	    }
	    // new method to return the ID instance variable
	    public int getID() {
	        return id;
	    }
	    public static int getNumberOfCars() {
	    return numberOfCars;
	    }
	    
	    public static void main(String [] args){

	    	Car c1=new Car("Indica");
	    	Car c2=new Car("Swift");
	    	Car c3=new Car("Alto");
	    	Car c4=new Car("nano");
	    	
	    	System.out.println("Id of c4 is :"+c4.getID());
	    	System.out.println(" No of cars :"+Car.getNumberOfCars());
	    	System.out.println("Model of c1 :"+c1.model);
	    }
	}

