package com.hashmap;

import java.util.ArrayList;

public class HashTable{
	public static void main(String[] args) {
		HashTableMap table=new HashTableMap();
		table.set("Balaji", 100);
		table.set("kabadi", 200);
		table.set("hockey", 11);
		table.set("cricket",7);
		System.out.println("value:"+table.get("cricket"));

		System.out.println("value:"+table.get("Balaji"));
		System.out.println("value:"+table.get("kabadi"));

		System.out.println("value:"+table.get("cricke"));
		table.printList();
		  System.out.println( table.keys() );
	        
		
	}
}

 class HashTableMap {

	int size=7;
	private NodeMap[] dataMap;
	HashTableMap(){
		dataMap=new NodeMap[size];
		
	}
	
	class NodeMap{
		String Key;
		int value;
		NodeMap next;
		NodeMap(String key,int value){
			this.Key=key;
			this.value=value;
		}
		}
	public void printList() {
		for(int i=0;i<dataMap.length;i++) {
			System.out.println(i+":");
			NodeMap temp=dataMap[i];
			while(temp!=null) {
				System.out.println("key"+temp.Key+", Value"+temp.value);
				temp=temp.next;
			}
		}
		
	}
	public int hash(String key) {
		int hash=0;
		char[] arr=key.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int asickey=arr[i];
			hash=(0+asickey*23)%dataMap.length;
		}
		return hash;
	}
	public void set(String key,int value) {
		int index=hash(key);
	NodeMap newNode=new NodeMap(key,value);
	if(dataMap[index]==null) {
		dataMap[index]=newNode;
	}
	else {
		NodeMap temp=dataMap[index];
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	}
public int get(String key) {
	int index=hash(key);
	if(dataMap[index]==null) return 0;
	NodeMap temp=dataMap[index];
	while(temp!=null) {
		if(temp.Key==key) { return temp.value;
		}
		temp=temp.next;
	}
	return temp.value;
	
}
public ArrayList keys() {
	ArrayList<String> allkeys=new ArrayList<>();
	for(int i=0;i<dataMap.length;i++) {
		NodeMap temp=dataMap[i];
		if(temp==null)continue;
		if(temp.next==null){
			allkeys.add(temp.Key);
		}
		else {
		while(temp!=null) {
			allkeys.add(temp.Key);
			temp=temp.next;
		}
		    
		}
	}
	return allkeys;
}
}