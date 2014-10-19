package com.training.java.day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FreqencyMap {
	 public static void main(String[] args) {
	        Map<String, Integer> m = new HashMap<String, Integer>();
	        // Initialize frequency table from command line
	        for (String a : args) {
	            Integer freq = m.get(a);
	            m.put(a, (freq == null) ? 1 : freq + 1);
	        }
	        System.out.println(m.size() + " distinct words:");
	        System.out.println(" Frequency of ram is "+m.get("ram"));
	        Iterator<String> keys=m.keySet().iterator();
	        while(keys.hasNext()){
	        	String key =keys.next();
	        	System.out.println(key+"="+m.get(key));
	        }
	    }
	}

