package com.LinkedList;
public class SinglyLinkedList {

    private Node head;
    private Node tail;

    public class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

   public SinglyLinkedList(int value) {
	Node newNode=new Node(value);
	head=newNode;
	tail=newNode;
   }
    public SinglyLinkedList() {
	// TODO Auto-generated constructor stub
}
	public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

	// WRITE FIND MIDDLE NODE METHOD HERE //
	//                                    //
	//                                    //
	//                                    //
	//                                    //
	////////////////////////////////////////
public Node findMiddleNode() {
    Node slow=head;
    Node fast=head;
//    if(fast==null) {return null;}
    while(fast.next!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}
public boolean hasLoop(){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(fast==slow){
            return true;
        }
    }
    return false;
}
public Node findKthFromEnd(int k){
    Node slow=head;
    Node fast=head;
    for(int i=0;i<k;i++){
        if(fast==null){
            return null;
        }
        fast=fast.next;
    }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
    
    return slow;
}
public void partitionList(int x){
	 if (head == null) return;
	 
     Node dummy1 = new Node(0);
     Node dummy2 = new Node(0);
     Node prev1 = dummy1;
     Node prev2 = dummy2;
     Node current = head;

     while (current != null) {
         if (current.value < x) {
             prev1.next = current;
             prev1 = current;
         } else {
             prev2.next = current;
             prev2 = current;
         }
         current = current.next;
     }

     prev2.next = null;
     prev1.next = dummy2.next;

     head = dummy1.next;
 }  

public void removeDuplicates(){
    Node temp=head;
    Node check=temp.next;
    Node prev=null;
    while(temp.next!=null){
        while(check.next!=null){ 
            prev=check;
            if(check.value==temp.value){
                Node remove=check;
                prev.next=remove.next;
                remove=null;
            }
            check=check.next;
        }
        temp=temp.next;
    }
}
}
