package com.company;

import BinarySearchTree.BST;
import BinarySearchTree.BSTNode;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BST kebab = new BST();

        kebab.insert(3);
        kebab.insert(6);
        kebab.insert(1);
        kebab.insert(16);
        kebab.insert(2);
        kebab.insert(7);


        kebab.find(0);

        System.out.println(kebab.find(7));



    }
}
