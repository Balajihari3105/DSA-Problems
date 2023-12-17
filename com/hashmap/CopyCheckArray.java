package com.hashmap;

import java.util.HashMap;

public class CopyCheckArray {

	public static void main(String []args)
	{

    // WRITE THE ITEMINCOMMON METHOD HERE //
    //                                    //
    //                                    //
    //                                    //
    //                                    //
    ////////////////////////////////////////
    
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println("hi"+itemInCommon(array1, array2));
       
    }
    public static boolean itemInCommon(int[] arr1,int[] arr2){
        
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(Integer i:arr1){
            map.put(i,true);
        }
        for(int j:arr2){
        	System.out.println(j +"and"+map.get(j));
            if(map.get(j)!=null) return map.get(j);
            
        }
        System.out.println(map);
    
    return false;
    }
    
}