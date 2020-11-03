package com.nishant.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ContainerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "|**|*|*";
		
		List<Integer> start = new ArrayList<Integer>();
		start.add(1);
		start.add(1);
		List<Integer> end = new ArrayList<Integer>();
		end.add(5);
		end.add(6);
		
		numberOfItems(s, start, end);
		
		NavigableMap<Integer, Integer> treeMap = new TreeMap<>();
		
		int countSoFar = 0;
	    for (int i = 0; i< s.length(); i++) {
	        if (s.charAt(i) == '|') {
	            treeMap.put(i, countSoFar);
	        } else {
	            countSoFar++;
	        }
	    }
	 //   System.out.println(treeMap);
	    
	}
	
	
	public static List<Integer> numberOfItems(String s, List<Integer> start, List<Integer> end) {
	    NavigableMap<Integer, Integer> treeMap = new TreeMap<>();

	    int countSoFar = 0;
	    for (int i = 0; i< s.length(); i++) {
	        if (s.charAt(i) == '|') {
	            treeMap.put(i, countSoFar);
	        } else {
	            countSoFar++;
	        }
	    }
	    List<Integer> list = new ArrayList<>();
	    for(int i = 0; i<start.size(); i++) {
	        list.add(number(treeMap, start.get(i) - 1, end.get(i) - 1));
	    }
	    System.out.println(list);
	    return list;
	}

	static int number(NavigableMap<Integer, Integer> treemap, int start, int end) {
	    if (treemap.floorEntry(end) == null || treemap.ceilingEntry(start) == null)
	        return 0;
	    int i = treemap.floorEntry(end).getValue() - treemap.ceilingEntry(start).getValue();
	    return Math.max(i, 0);
	}

}
