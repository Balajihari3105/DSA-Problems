package com.Pratice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class twoSum {
    // WRITE THE TWOSUM MEHTOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    

    public static void main(String[] args) {


        
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */
    }
    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();
     
        // Iterate over each number in the input array
        for (int i = 0; i < nums.length; i++) {
            // Get the current number
            int num = nums[i];
            // Calculate the complement needed to reach the target
            int complement = target - num;
     
            // Check if the map contains the complement
            if (numMap.containsKey(complement)) {
                // Return the indices of the complement and current number
                return new int[]{numMap.get(complement), i};
            }
            // Store the current number and its index in the map
            numMap.put(num, i);
        }
     
        // Return an empty array if no pair was found
        return new int[]{};
    
    

}
}

