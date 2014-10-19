package com.training.java.day10;

import java.util.List;

public class GenericPool<E> {
	private List<E> objects ;
	
	public GenericPool(List<E> objects){
		this.objects=objects;
	}
	public E  getObject()throws InterruptedException{	
		synchronized (objects) {
			while (objects.isEmpty()) {
				objects.wait();
			}
			return objects.remove(0);
		}
	}
	public void returnObject(E str)throws InterruptedException {
		synchronized (objects) {
			objects.add(str);
			objects.notifyAll();
		}
	}
}