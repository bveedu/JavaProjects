package com.training.java.day4;

public  class BouncingApple  extends Apple implements Bounceable,Eatable{

	public int bounceFactor;
	public void bounce() {
		System.out.println("Bouncing Apple");
		
	}
	public void setBounceFactor(int factor) {
		this.bounceFactor=factor;
		
	}
	public void eat() {
		System.out.println(" Eating BouncingApple ");
		
	}
}
 interface Eatable {
		 void eat();
 }