package com.nishant.test;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Janya", 1, 7));
		al.add(new Student("Nishant", 4, 37));
		al.add(new Student("Pooja", 2, 33));
		al.add(new Student("Pallavi", 5, 27));
		al.add(new Student("Pradnya", 3, 28));
		
		Collections.sort(al);
		
		for(Student str: al){
			System.out.println(str);
	   }

	}

}
