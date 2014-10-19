package com.training.java.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input First Integer");
		int a=Integer.parseInt(reader.readLine());
	    System.out.println("Input Second Integer");
		int b=Integer.parseInt(reader.readLine());
		int sum=a+b;
		System.out.println("Sum is :"+sum);
		
	}

}
