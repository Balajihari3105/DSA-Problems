package com;

public class MixSort {
public static void main(String[] aregs) {
	int [] num= {1, 2, 3, 4, 5, 6, 7};
	int [] sort=new int[num.length];
	sort(num);
}
//7,1,6,2,5,3,4
private static void sort(int [] arr) {
	int []num=arr;
//	for(int i:num) {
//		System.out.println(i);
//	}
	for(int i=0;i<num.length;i=i+2) {
		int temp=num[i];
		num[i]=num[num.length-1];
		int n=num.length-1;
		while(n>i) {
			num[n]=num[n-1];
			if(n==i+1)
			{
				num[i+1]=temp;
			}
			n--;
		}
		
	}
	
	for(int i:num) {
		System.out.print(i);
	}
	
}
}
