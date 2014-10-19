package com.training.java.day8;

import java.util.ArrayList;
import java.util.List;

import com.training.java.day10.GenericPool;

public class ThreadExampleGeneric {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<String>(5);
		for (int i = 0; i < 2; i++) {
			strings.add(new String("String "+i));
		}
		GenericPool<String> pool = new GenericPool<String>(strings);
		GenericConsumer c1=new GenericConsumer(pool, 1);
		GenericConsumer c2=new GenericConsumer(pool, 2);
		GenericConsumer c3=new GenericConsumer(pool, 3);
		GenericConsumer c4=new GenericConsumer(pool, 4);
		GenericConsumer c5=new GenericConsumer(pool, 5);
		GenericConsumer c6=new GenericConsumer(pool, 6);
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

	class GenericConsumer extends Thread {
		private GenericPool<String> stringPool;
		private int number;

		public GenericConsumer(GenericPool<String> pool, int number) {
			stringPool = pool;
			this.number = number;
		}
		public void run() {
			String value =null;
			for (int i = 0; i < 20; i++) {
				try {
					value = stringPool.getObject();
				
				if(value ==null){
					break;
				}
				System.out.println("GenericConsumer #" + this.number
						+ " got: " + value);
				stringPool.returnObject(value);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}





