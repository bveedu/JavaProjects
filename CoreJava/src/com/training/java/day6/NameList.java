package com.training.java.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameList {
	 public static void main(String[] args) {
	        List<String> list = new ArrayList<String>(Arrays.asList(args));
	        System.out.println("Initial list :"+list);
	        list.add("Kumar");// adding a new object
	        list.remove(0); //removing the 0th element
	        System.out.println("Updated list :"+list);
	        //Shuffling
	        Collections.shuffle(list);
	        System.out.println("Shuffled list :"+list);
	        //Sorting
	        Collections.sort(list);
	        System.out.println("Sorted list :"+list);
	    }
}
