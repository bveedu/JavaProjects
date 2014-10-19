package com.training.java.day6;

import java.util.*;

public class FindDups {
    public static void main(String[] args) {
     /*   Set<String> s = new TreeSet<String>();
        for (String a : args){
            if (!s.add(a)) {
                System.out.println("Duplicate detected: " + a);
           }
	   }*/
       /* Iterator<String > it=s.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }
    */
      Set <Student> students =new HashSet<Student>();
      
      Student s1=new Student();
      s1.setName("Ganesh");
      Student s2=new Student();
      s2.setName("Abin");
      Student s3=new Student();
      s3.setName("Bala");
      Student s4=new Student();
      s4.setName("Suresh");
      Student s5=new Student();
      s5.setName("Suresh");
      students.add(s1);
      students.add(s2);
      students.add(s3);
      students.add(s4);
      students.add(s5);
      Iterator<Student > its=students.iterator();
      while(its.hasNext()){
      	System.out.println(its.next().getName());
      }
    }
}

class Student implements Comparable<Student>{
	
	Object obj=new Object();
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.name.compareTo(student.getName());
	}
	public boolean equals(Object s){
		return this.name.equals(((Student)s).getName());
	}
	public int hashCode(){
		return name.length();
	}
}