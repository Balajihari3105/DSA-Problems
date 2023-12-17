package com.Pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prohram3 {


    public static void main(String[] args) {
       
    	String s="WELCOMETOZOHOCORPORATION";
    	String[][] str=new String[5][(s.length()/5)+1];
    	int row=0;
    	int col=0;
    	for(int i=0;i<s.length();i++) {
    		
    		if(col<str[row].length) {
    			str[row][col++]=String.valueOf(s.charAt(i));
    		}
    		else {
    			row++;
    			col=0;
    			str[row][col++]=String.valueOf(s.charAt(i));
    			
    		}
    	}
    	for(int i=0;i<str.length;i++) {
    		for(int j=0;j<str[i].length;j++) {
    			System.out.print(str[i][j]);
    			
    		}
    		System.out.println();
    		}
    	row=0;
    	col=0;
    	for(int i=0;i<str.length;i++) {
    		boolean flag=false;
    		for(int j=0;j<str[i].length-2;j++) {
    			String sub=str[i][j]+str[i][j+1]+str[i][j+2];
    			if(sub.equalsIgnoreCase("TOO")) {
    				flag=true;
    			System.out.println("starting<"+i+","+j+">");
    			System.out.println("ending<"+(i)+"," +(j+2)+">");
    			break;
    			}
		for(int k=0;k<str.length-2;k++) {
		    sub=str[k][j]+str[k+1][j]+str[k+2][j];
			if(sub.equalsIgnoreCase("too")) {
				flag=true;
    			System.out.println("starting<"+k+","+j+">");
    			System.out.println("ending<"+(k+2)+","+(j)+">");
    			break;
    			}
		}
		if(flag)break;
		}
    		if(flag)break;
    		
    		
    }
    
    }
    }