package com.training.java.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CompanySerialization {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectOutputStream outputStream=null;
		ObjectInputStream intputStream=null;
		try {
			outputStream=new ObjectOutputStream(
					new FileOutputStream("C:\\JavaProjects\\company.txt"));

			Company c1=new Company("Ness","Bangalore"); 
			outputStream.writeObject(c1);
			outputStream.flush();
			intputStream=new ObjectInputStream(
					new FileInputStream("C:\\JavaProjects\\company.txt"));
			Company company =(Company)intputStream.readObject();
			System.out.println("company after serialization :"+
					company.getName()+ ","+company.getLocation());
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				intputStream.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class Company implements Serializable{
	
	String name;
	public String getName() {
		return name;
	}
	Company (String name,String location){
		this.name=name;
		this.location=location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	String location;
}


