package com;


import java.util.*;
import java.lang.*;
import java.io.*;


public class String1 {
	/* package codechef; // don't place package name! */

	/* Name of the class has to be "Main" only if the class is public. */
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			
			for(int i=0;i<T;i++){
			     int l1=0;
			    int l2=0;
			    String s1=sc.next();
			    String s2=sc.next();
			   
			    for(int j=0;j<s1.length();j++){
			        if(s1.charAt(j)=='?'){
			            l1++;
			        }
			        if(s2.charAt(j)=='?'){
			            l2++;
			        }
			        else continue;
			    }
			    if(l1==l2){
			        System.out.println("Yes");
			    }
			    else{
			        System.out.println("No");
			    }
			}
		}
	}

