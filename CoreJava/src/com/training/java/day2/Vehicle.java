package com.training.java.day2;

public class Vehicle {
	private String name;
	private int loadLimit;
	public int getLoadLimit() {
		return loadLimit;
	}
	public void setLoadLimit(int loadLimit) {
		this.loadLimit = loadLimit;
	}
	public Vehicle(){
	}
	public Vehicle(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
