package com.Pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GrandChild {
//<”luke”, “shaw”>
//	  <”wayne”, “rooney”>
//	  <”rooney”, “ronaldo”>
//	  <”shaw”, “rooney”>
	 static Map<String, List<String>> parentChildMap = new HashMap<>();

	    public static void main(String[] args) {
	        String[][] parentChildRelationships = {
	                {"luke", "shaw"},
	                {"wayne", "rooney"},
	                {"rooney", "ronaldo"},
	                {"done","rooney"},
	                {"shaw", "rooney"}
	        };

	        createParentChildMap(parentChildRelationships);
	     	System.out.println(parentChildMap);
	     	String gr="ronaldo";
	        int grandchildrenCount = countGrandchildren(gr);
	        System.out.println("Number of grandchildren for ronaldo: " + grandchildrenCount);
	    }

	    private static void createParentChildMap(String[][] parentChildRelationships) {
	        for (String[] relationship : parentChildRelationships) {
	            String parent = relationship[1];
	            String child = relationship[0];

	            if (!parentChildMap.containsKey(parent)) {
	                parentChildMap.put(parent, new ArrayList<>());
	            }

	            parentChildMap.get(parent).add(child);
	        }
	    }

	    private static int countGrandchildren(String person) {
	    	int count = 0;
	    	if(!parentChildMap.containsKey(person)) {
	    		return 0;
	    	}
	    	ArrayList <String> ls=(ArrayList<String>) parentChildMap.get(person);
	    	for(String s:ls) {
	    		int k=parentChildMap.containsKey(s)?parentChildMap.get(s).size():0;
	    		count+=k;
	    	}

	   return count;     	  
	    }
	}
