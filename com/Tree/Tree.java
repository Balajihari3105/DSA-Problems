package com.Tree;

public class Tree {
    Node root;
    class Node{
        int value;
        Node leftNode;
        Node rightNode;
        Node (int value){
            this.value=value;
        }
    }
    public void printTree(){
        
         System.out.println(   root);
        }
    
    }

