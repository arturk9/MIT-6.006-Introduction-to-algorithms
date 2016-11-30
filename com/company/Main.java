package com.company;

import BinarySearchTree.BST;
import BinarySearchTree.BSTNode;

public class Main {

    public static void main(String[] args) {

        /* Setting up BST */
        BST tree = new BST();
        tree.insert(23);
        tree.insert(8);
        tree.insert(4);
        tree.insert(16);
        tree.insert(15);
        tree.insert(42);

        /* Testing INSERT */
        tree.insert(5);
        assert 5 == tree.find(5).getKey();
        tree.insert(3);
        assert 3 == tree.find(3).getKey();

        /* Test NextLarger */

        /* Test FindMin */

        /* Test Find */

        /* Testing DELETE with no children */
        tree.delete(15);
        assert tree.find(15) == null;

        /* Testing delete with one child */
        tree.delete(16);
        assert tree.find(16) == null;

        /* Test delete with two children */
        tree.delete(8);
        assert tree.find(8) == null;

        /* Test delete root */
    }
}
