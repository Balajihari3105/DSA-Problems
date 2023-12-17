package com.Pratice;

public class Program3 {
public static void main(String[] args)
{
	String str="WELCOMETOZOHOCORPORATION";
	int startIndexRow=-1;
	int startIndexColumn=-1;
	int endIndeRow=-1;
	int endIndexColumn=-1;
	int row = 0, col = 0;
	String[][] s=new String[3][7];
	for (int i = 0; i < str.length(); i++) {
		if(row<s.length) {
	    s[row][col] = String.valueOf(str.charAt(i));
	    col++;
	    
		}
	    if (col == 7) {
	        col = 0;
	        row++;
	    }
	}

	for(int i=0;i<s.length;i++)
	{
		for(int j=0;j<s[i].length;j++) 
		{
			System.out.println(s[i][j]);
		}
	}
	
}
}
