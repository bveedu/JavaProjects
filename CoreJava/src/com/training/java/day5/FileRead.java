package com.training.java.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	static String getData(String fileName) throws IOException{
		String data =null;
		BufferedReader reader =null;
		try {
			 reader = new BufferedReader(new FileReader(fileName));
			data =reader.readLine();
		} finally {
			if(reader !=null){
			reader.close();
			}
			System.out.println("Reader closed for "+fileName);
		}
		return data;
	}
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		
		try {
			System.out.println(" Data :"+getData("C:\\JavaProjects\\sample.txt"));
		} catch (IOException e) {
			System.out.println("Got exception :"+e.getMessage());
		}
	}

}
