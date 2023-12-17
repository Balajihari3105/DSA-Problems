package com.hashmap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CheckDuplicates {

  
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
    }
public static List findDuplicates(int [] arr){
    HashSet<Integer> set=new HashSet<>();
    List<Integer> list=new ArrayList<>();
    for(int i:arr){
//        if(set.contains(i)){
        	if(!list.contains(i))
            list.add(i);
//        }
//        else {
//        	set.add(i);
//        }
    }
    return list;
}
}
