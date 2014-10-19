package com.training.java.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator3 {
	/**
	 * @param args1
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Choose one of the following options");
		System.out.println(" 1:Addition");
		System.out.println(" 2:Substraction");
		System.out.println(" 3:Multiplication");
		System.out.println(" 4:Division");
		int option=Integer.parseInt(reader.readLine());
		System.out.println("Input First Integer");
		int a=Integer.parseInt(reader.readLine());
		System.out.println("Input Second Integer");
		int b=Integer.parseInt(reader.readLine());
		switch(option){
		case 1:	int sum=a+b;
				System.out.println("Sum is :"+sum);
				break;
		case 2:	int difference=a-b;
				System.out.println("Difference is :"+difference);
				break;
		case 3:	int product=a*b;
				System.out.println("Product is :"+product);
				break;
		case 4: if(b==0){
					System.out.println("Divisor cannot be zero");
					break;
				}
				int quotient=a/b;
				System.out.println("Quotient is :"+quotient);
				break;
		default :System.out.println("Invalid option.");	
		}
		
	}

}
