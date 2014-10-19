package com.training.java.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class ObjectSerializer {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectInputStream in=null;
		ObjectOutputStream out=null;
	
		try {
			out=new ObjectOutputStream(new FileOutputStream("C:\\JavaProjects\\object.txt"));
			out.writeObject("Ramesh");
			out.writeObject(new Date());
			out.flush();
			in =new ObjectInputStream(new FileInputStream("C:\\JavaProjects\\object.txt"));
			String name =(String)in.readObject();
			Date date =(Date)in.readObject();
			System.out.println("Name after serialization :"+name);
			System.out.println("Date after serialization :"+date);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


