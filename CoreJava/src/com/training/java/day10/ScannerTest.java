package com.training.java.day10;

import java.util.Scanner;

public class ScannerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println(" Input a name and age");
		String param= s.next();
		int value=s.nextInt();
		System.out.println(" Inputs are :"+param+" "+value);
	}

}
