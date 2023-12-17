package com.Pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SortByWeight {
	public static void main(String []args) {
		int[] num= {10, 36, 54,89,12};
		ArrayList<Pairs> arr=new ArrayList<>();
		for(int i=0;i<num.length;i++) {
			int weight=0;
			int n=num[i];
			if(n%2==0) {
				weight+=3;
			}
			if(n%4==0 && n%6==0) {
				weight+=2;
			}
			int f=(int) Math.sqrt(n);
			if(f*f==n) {
				weight+=5;
			}
			arr.add(new Pairs(n,weight));
		}
		System.out.println(arr);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+" ");
		}
		Collections.sort(arr);
//		,new Comparator<Pairs>() {
//
//			@Override
//			public int compare(Pairs o1, Pairs o2) {
//				// TODO Auto-generated method stub
//				return o1.getNum() > o2.getNum()?1:-1;
//			}
			
//		});
		for(Pairs i:arr) {
			System.out.println("<"+i.num+","+i.weight+">");
		}

	}
	

}
class Pairs implements Comparable<Pairs>{
	int num;
	int weight;
	Pairs(int num,int weight){
		this.num=num;
		this.weight=weight;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Pairs [num=" + num + ", weight=" + weight + "]";
	}
	@Override
	public int compareTo(Pairs that) {
		if(this.weight>that.weight) {
			return 1;
		}
		else return -1;
	}
	
	
	
}