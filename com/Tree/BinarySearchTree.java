package com.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

	public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

	//// WRITE BFS METHOD HERE ////
	//                           //
	//                           //
	//                           //
	//                           //
	///////////////////////////////
	public List<Integer> BFS(){
	    ArrayList<Integer> result=new ArrayList<>();
	    Queue<Node> queue=new LinkedList<>();
	    Node currentNode=root;
	    queue.add(currentNode);
	    while(queue.size()>0){
	        result.add(queue.remove().value);
	        if(currentNode.left!=null){
	            queue.add(currentNode.left);
	        }
	        if(currentNode.right!=null){
	            queue.add(currentNode.right);
	        }
            currentNode=queue.peek();

	    }
	    return result;
	}
    public int kthSmallest(int k){
        ArrayList<Integer> result=new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left!=null)
                new Traverse(currentNode.left);
                if(currentNode.right!=null)
                new Traverse(currentNode.right);
                result.add(currentNode.value);
                
            }
        }

            new Traverse(root);
            System.out.println(result);
        return result.get(k);
    }
}