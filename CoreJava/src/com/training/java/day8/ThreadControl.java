package com.training.java.day8;

public class ThreadControl {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() {
			  public void run() {
			    try {
			      int i=0;
			      while (++i<50) {
			        System.out.println("Hello, world!");
			       Thread.sleep(1000L);
			      }
			    } catch (InterruptedException iex) {
			    	System.out.println("Interrupted");
			    }
			  }
			};
			Runnable r2 = new Runnable() {
			  public void run() {
			    try {
			      while (true) {
			        System.out.println("Goodbye, " +
					"cruel world!");
			        Thread.sleep(2000L);
			      }
			    } catch (InterruptedException iex) {
			    	System.out.println("Interrupted");
			    }
			  }
			};
			Thread thr1 = new Thread(r1);
			Thread thr2 = new Thread(r2);
			thr1.start();
			thr2.start();
			//thr1.stop();
			thr2.interrupt();
			thr1.join();
			System.out.println("I am main thread"); 
	}

}




