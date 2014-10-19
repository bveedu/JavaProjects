package com.training.java.day4;

abstract class Fruit {

	abstract String getColor();
	abstract double getPrice();
	public String toString(){
		return ("Fruit");
	}
}

class Apple extends Fruit{
	
	String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}
	double getPrice() {
		// TODO Auto-generated method stub
		return 40;
	}
	public String toString(){
		return ("Apple");
	}
	public final String getTaste(){
		return "Good";
	}
}
 class Orange extends Fruit{
	
	String getColor() {
		// TODO Auto-generated method stub
		return "Orange";
	}
	double getPrice() {
		// TODO Auto-generated method stub
		return 60;
	}
	public String toString(){
		return ("Orange");
	}
}

 