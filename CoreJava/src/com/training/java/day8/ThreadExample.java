package com.training.java.day8;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		StringPool pool = new StringPool();
		Consumer c1=new Consumer(pool, 1);
		Consumer c2=new Consumer(pool, 2);
		Consumer c3=new Consumer(pool, 3);
		Consumer c4=new Consumer(pool, 4);
		Consumer c5=new Consumer(pool, 5);
		Consumer c6=new Consumer(pool, 6);
		//c2.setPriority(Thread.MAX_PRIORITY);
		c1.start();
		//Thread.sleep(5000L);
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
	}
		
}
	/**
	 * Example of wait and notify
	 * @author bveedu
	 *
	 */
	 class StringPool {
		private List<String> strings = createStrings();
		private List<String> createStrings() {
			List<String> strings = new ArrayList<String>(5);
			for (int i = 0; i < 2; i++) {
				strings.add(new String("String "+i));
			}
			return strings;
		}
		public String  getString()throws InterruptedException{	
			synchronized (strings) {
				while (strings.isEmpty()) {
					strings.wait();
				}
				return strings.remove(0);
			}
		}
		public void returnString(String str)throws InterruptedException {
			synchronized (strings) {
				strings.add(str);
				strings.notifyAll();
			}
		}
	}


	class Consumer extends Thread {
		private StringPool stringPool;
		private int number;

		public Consumer(StringPool pool, int number) {
			stringPool = pool;
			this.number = number;
		}
		public void run() {
			String value =null;
			for (int i = 0; i < 20; i++) {
				try {
					value = stringPool.getString();
				
				if(value ==null){
					break;
				}
				System.out.println("Consumer #" + this.number
						+ " got: " + value);
				stringPool.returnString(value);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}





