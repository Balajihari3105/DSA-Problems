package com.main;
import com.Tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("Breadth First Search:");
        System.out.println( myBST.BFS() );
System.out.println(myBST.kthSmallest(2));
        /*
            EXPECTED OUTPUT:
            ----------------
            Breadth First Search:
            [47, 21, 76, 18, 27, 52, 82]

        */

    }

}