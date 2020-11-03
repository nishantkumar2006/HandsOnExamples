package com.nishant.test;

public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 3, 5, 8, 9, 1, 0, 7, 6, 8, 9}; 
        int n = arr.length; 
        
        canJump(arr);

	}
	
		  public static boolean canJump(int[] nums) {
		    int n = nums.length;

		    // max position one could reach 
		    // starting from index <= i
		    int maxPos = nums[0];

		    for (int i = 1; i < n; ++i) {
		      // if one could't reach this point
		      if (maxPos < i) {
		        return false;
		      }
		      maxPos = Math.max(maxPos, nums[i] + i);
		    }
		    return true;
		  }
		

}
