package com.training.java.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator2 {
	/**
	 * @param args1
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter 1 for Addition and 2 for substraction");
		int option=Integer.parseInt(reader.readLine());
		System.out.println("Input First Integer");
		int a=Integer.parseInt(reader.readLine());
		System.out.println("Input Second Integer");
		int b=Integer.parseInt(reader.readLine());
		if (option ==1){
			int sum=a+b;
			System.out.println("Sum is :"+sum);
		}else if (option ==2){
			int difference=a-b;
			System.out.println("Difference is :"+difference);
			
		}else {
			System.out.println("Invalid option.Choose only 1 or 2");
		}
	}

}
