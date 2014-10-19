package com.training.java.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 FileReader in=null;
		 PrintWriter writer =null;
		 try {
			in =new FileReader(new File("C:\\JavaProjects\\input.txt"));
			writer=new PrintWriter(new File("C:\\JavaProjects\\output.txt"));
			BufferedReader reader =new BufferedReader(in);
			String data =null;
			while((data=reader.readLine())!=null){
				System.out.println("Data :"+data);
				writer.write(data+"\n");
			}
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				in.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 

	}

}
