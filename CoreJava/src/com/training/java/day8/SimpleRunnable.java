package com.training.java.day8;

public class SimpleRunnable implements Runnable{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t=new Thread(new SimpleRunnable());
		t.start();
		System.out.println("Hello from main");
	}

	public void run() {
		System.out.println("Hello from SimpleRunnable");
	}

}
