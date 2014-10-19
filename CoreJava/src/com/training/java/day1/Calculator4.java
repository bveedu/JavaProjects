package com.training.java.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator4 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Array of floating point numbers
		float[] numbers=new float[5];
		float sum=0;
		// Reader to accept data from console
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 5 decimal numbers one by one");
        // loop to read 10 numbers
        for(int i=0;i<5;i++){
        	numbers[i]=Float.parseFloat((reader.readLine()));
        	sum += numbers[i];
        }
        System.out.print("Numbers are :");
        for(int i=0;i<5;i++){
        	System.out.print(","+numbers[i]);
        }
       
		System.out.println("\nSum is :"+sum);
	}

}
