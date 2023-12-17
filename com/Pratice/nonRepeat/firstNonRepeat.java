package com.Pratice.nonRepeat;
import java.util.*;


public class firstNonRepeat {
    
    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    //                                         //
    //                                         //
    //                                         //
    //                                         //
    /////////////////////////////////////////////
	public static void main(String[] args) {
        System.out.println(firstNonRepeatingCha("leetlcode"));
        System.out.println(firstNonRepeatingCha("hello"));
        System.out.println(firstNonRepeatingCha("aabbcc"));
		System.out.println("helli");
        
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */
        
    }

public static Character firstNonRepeatingCha(String string) {
	//l,1 
	//e,2
	//t,0
	//c,0
	//o,0
	//d,0
    // Create a map to store the frequency of each character
    Map<Character, Integer> charCounts = new HashMap<>();
 
    // Count the frequency of each character in the string
    for (int i = 0; i < string.length(); i++) {
        char c = string.charAt(i);
        charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
    }
    System.out.println(charCounts);
 
    // Iterate over the characters again to find the 
    // first non-repeating character
    for (int i = 0; i < string.length(); i++) {
        char c = string.charAt(i);
        if (charCounts.get(c) == 1) {
            return c;
        }
    }
 
    return null;
}
    
    
}
