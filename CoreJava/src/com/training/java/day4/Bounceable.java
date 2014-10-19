package com.training.java.day4;

public interface Bounceable {
	 double pi=3.14;
void bounce();
void setBounceFactor(int factor);
}

class Tire implements Bounceable{

private int bounceFactor;
public void bounce() {
	System.out.println("Bouncing with factor :"+bounceFactor);

}
public void setBounceFactor(int factor) {
	this.bounceFactor=factor;
}
}
