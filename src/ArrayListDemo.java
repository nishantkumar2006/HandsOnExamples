package com.nishant.test;

import java.util.ArrayList;

public class ArrayListDemo { 
public static void main(String[] args) 
    { 
  
        // create an empty array list with an initial capacity 
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5); 
  
        // use add() method to add elements in the list 
        arrlist.add(10); 
        arrlist.add(22); 
        arrlist.add(30); 
        arrlist.add(40); 
  
        // adding element 35 at nth position 
        arrlist.remove(2);
        arrlist.add(0, 35); 
  
        
        System.out.println("The arrlist is: " + arrlist);
        // let us print all the elements available in list 
        for (Integer number : arrlist) { 
            System.out.println("Number = " + number); 
        } 
    } 
} 
