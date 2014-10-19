package com.training.java.day5;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x,y;
			x = 0;
			y = 10;
			int div=0;
			try {
				div = y / x;
				System.out.println("Quotient :"+div);
			}catch (ArithmeticException e) {
				System.out.println("Division by zero is not allowed");
				//e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Exception happened :"+e.getMessage());
			}
			System.out.println("End of the program");
	}
}

