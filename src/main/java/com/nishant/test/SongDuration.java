package com.nishant.test;

import java.util.ArrayList;
import java.util.List;

public class SongDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> songList = new ArrayList<Integer>();
		songList.add(30);
		songList.add(20);
		songList.add(150);
		songList.add(100);
		songList.add(40);
		
		getSongPairCount(songList);
		
	}
	
	 public static long getSongPairCount(List<Integer> songs) {
		
		 int [] count = new int[60];
		 
		 int songPairs = 0;
		 
		 for(int t : songs) {
			 
			// songPairs += count[(60-t % 60) % 60];
			 
			 songPairs = songPairs + count[(60-t % 60) % 60];
			 
			 count[t%60] = count[t%60] + 1;
			 
			// count[t%60] +=1;
			 
		 }
		 
		 System.out.println(songPairs);
		 
		 return songPairs;	 
	 }

}
