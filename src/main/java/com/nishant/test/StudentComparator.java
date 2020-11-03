package com.nishant.test;

import java.util.Comparator;

public class StudentComparator {

	
	private String studentname;
    private int rollno;
    private int studentage;
    
	public StudentComparator(String studentname, int rollno, int studentage) {
		//super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	
	public static Comparator<StudentComparator> StuNameComparator = new Comparator<StudentComparator>() {
		
		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			// TODO Auto-generated method stub
			String stuName1 = o1.getStudentname();
			String stuName2 = o2.getStudentname();
			
			//ascending order
			return stuName1.compareTo(stuName2);
			
			//descending order
			   //return stuName2.compareTo(stuName1);
		}
	};
	
	
	public static Comparator<StudentComparator> stuRollNo = new Comparator<StudentComparator>() {
		
		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			// TODO Auto-generated method stub
			int rollno1 = o1.getRollno();
			int rollno2 = o2.getRollno();
			
			/*For ascending order*/
			return rollno1-rollno2;
			
			/*For descending order*/
			   //rollno2-rollno1;
		}
	};
	

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
}
