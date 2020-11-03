package com.nishant.test;

public class SumSquare {

	 // driver Program 
    public static void main(String args[]) 
    { 
        int n = 25; 
        if (sumSquare(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    }

	private static boolean sumSquare(int n) {
		// TODO Auto-generated method stub
		for(int i = 1; i*i <=n; i++) {
			for(int j = 1; j*j <=n; j++) {
				if (i * i + j * j == n) { 
				
				System.out.println(i + "^2 + "
                        + j + "^2"); 
				return true;
				}	
			}
			
			
		}
		
		
		return false;
	}
	
}
