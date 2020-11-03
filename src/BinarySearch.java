package com.nishant.dsalgo;

class BinarySearch { 
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    int binarySearch(int arr[], int key, int low, int high) 
    {  
     // int middle = low +( high-low)/2;
    	
    	int middle = low + high/2;
      
     // l + (r - l) / 2;
      
      if(key == arr[middle]) {
    	  
    	  return middle;
      }else if(key < arr[middle]) {
    	  //binarySearch
    	  
    	  return binarySearch(arr, key, low, middle-1);
    	  
      }else {
    	  
    	  return binarySearch(arr, key, middle+1, high);
      }
    	
    	
       // return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40,50,60,70,80,90 }; 
        int n = arr.length; 
        //int x = 90; 
        int key=0;
        int low = 0;
        int high =arr.length-1;
        int result = ob.binarySearch(arr, key , low, high); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
