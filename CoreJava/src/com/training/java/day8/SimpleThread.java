package com.training.java.day8;

public class SimpleThread extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleThread simpleThread = new SimpleThread();
		//simpleThread.run();
		simpleThread.start();
		for(int i=0;i<50;i++){
		System.out.println(i+" Hello from main");
		}
		simpleThread.stop();
	}

	public void run(){
		for(int i=0;i<50;i++){
		System.out.println(i+ "Hello from SimpleThread");
		}
	}
}
