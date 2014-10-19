package com.training.java.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		FileReader in=null;
		FileWriter out=null;
		try {
			in =new FileReader(new File("C:\\JavaProjects\\input.txt"));
			out=new FileWriter(new File("C:\\JavaProjects\\output.txt"));
			int c;
			while ((c=in.read())!=-1){
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
