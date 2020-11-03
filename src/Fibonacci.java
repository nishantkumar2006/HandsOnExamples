package com.nishant.test;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		
		/// 0,1,1,2,3,5,8,13
		// TODO Auto-generated method stub
		
		
		int firstNum = 0;
		int secondNum = 1;
		long count= 5;
		long sum = 0;
		//List l = new ArrayList<>();
		
		getFibo(5);
		
//	sum=	fib(count);
	//System.out.println(sum);
		
		if(count ==1) {
			//System.out.println(count);
			
		}
		
		if(count ==2) {
		//	System.out.println(count);
			
		}
		
		
		for(int i =3; i <=count; i++) {
			
			sum = firstNum +secondNum;
			firstNum=secondNum ;
			//secondNum = sum;
			
			
		}
	//	System.out.println("sum::"+sum);
		//System.out.println(count);

	}
	
	
	
	public static long fib(long n) {
		   if ((n == 0) || (n == 1))
		      return n;
		   else
		      return fib(n - 1) + fib(n - 2);
		}
	
	public static void getFibo(int maxNumber) 
	{
		// Set it to the number of elements you want in the Fibonacci Series
		// int maxNumber = 3; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	       // System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	           // System.out.println(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
 
	            
	            
	            int sum = previousNumber + nextNumber;
	            
	            System.out.println("sum::"+sum);
	            
	            System.out.println("previousNumber::"+previousNumber);
	            System.out.println("nextNumber::"+nextNumber);
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
	}
	
	
	public static long fibonacci(long n) {

		return  n<=1 ? n : fibonacci(n-1) + fibonacci(n-2);
		
		}

}
