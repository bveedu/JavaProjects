package com.training.java.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Properties prop=new Properties();
			FileInputStream in = new FileInputStream("C:\\appProperties.properties");
			prop.load(in);
			//prop.put("name", "ram");
			System.out.println(prop.get("name"));
	/*		FileOutputStream out = new FileOutputStream("C:\\appProperties.properties");
			prop.store(out, "---No Comment---");
			out.close();*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
