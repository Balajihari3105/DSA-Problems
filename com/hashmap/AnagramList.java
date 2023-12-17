package com.hashmap;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramList {

	    
	    // WRITE GROUPANAGRAMS METHOD HERE // 
	    //                                 //
	    //                                 //
	    //                                 //
	    //                                 //
	    /////////////////////////////////////
	    

	    public static void main(String[] args) {
	        System.out.println("1st set:");
	        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

	        System.out.println("\n2nd set:");
	        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

	        System.out.println("\n3rd set:");
	        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

	        /*
	            EXPECTED OUTPUT:
	            ----------------
	            1st set:
	            [[eat, tea, ate], [tan, nat], [bat]]

	            2nd set:
	            [[abc, cba, bac], [foo], [bar]]

	            3rd set:
	            [[listen, silent], [triangle, integral], [garden, ranged]]

	        */
	        
	    
	    
	}

		private static List<List<String>>groupAnagrams(String[] str) {
			// TODO Auto-generated method stub
		  Map<Integer,List<String>> map=new HashMap<>();
		  for(int i=0;i<str.length;i++) {
			  int index=hash(str[i]);
			  if(!map.containsKey(index)) {
				  map.put(index, new ArrayList<>());
			  }
			 map.get(index).add(str[i]);
		  }
			List<List<String>> list=new ArrayList<>();
			for(Integer i:map.keySet()) {
				list.add(map.get(i));
			}
			return list;
		}

		private static int hash(String str) {
			// TODO Auto-generated method stub
			int index=0;
			char[] arr=str.toCharArray();
			for(int i=0;i<arr.length;i++) {
				index=(index+arr[i])%7;		
				}

		return index;
		}
}
