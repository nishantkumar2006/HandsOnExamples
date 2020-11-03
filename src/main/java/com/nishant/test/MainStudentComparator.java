package com.nishant.test;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudentComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<StudentComparator> al = new ArrayList<>();
		al.add(new StudentComparator("Janya", 1, 7));
		al.add(new StudentComparator("Nishant", 4, 37));
		al.add(new StudentComparator("Pooja", 2, 33));
		al.add(new StudentComparator("Pallavi", 5, 27));
		al.add(new StudentComparator("Pradnya", 3, 28));
		
		System.out.println("Student Name Sorting");
		
		Collections.sort(al, StudentComparator.StuNameComparator);
		
		for(StudentComparator sc : al){
			
			System.out.println(sc);
		}
			
			System.out.println("RollNum Sorting:");
			Collections.sort(al, StudentComparator.stuRollNo);
			
			
			for(StudentComparator sc : al){
				
				System.out.println(sc);
			}
		//}
	}

}
