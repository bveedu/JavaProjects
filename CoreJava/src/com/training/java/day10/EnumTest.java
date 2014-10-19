package com.training.java.day10;


enum TrafficLight { red, amber, green }; 

class TrafficSystem {
	TrafficLight light;

	public void setTrafficLight(TrafficLight light){
		this.light=light;
	}
}

public class EnumTest {

	public static void main(String [] args){
		TrafficSystem trafficSystem=new TrafficSystem();
		trafficSystem.setTrafficLight(TrafficLight.amber);
		System.out.println(trafficSystem.light);
	}
}