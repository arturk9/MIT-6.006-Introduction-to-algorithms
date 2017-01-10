package com.company;

import BinarySearchTree.BST;

import InsertionSort.InsertionSort;
import MaximumSubarray.MaximumSubarray;
import MergeSort.MergeSort;

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
        assert 3 == tree.find_min().getKey();

        /* Test Find */

        /* Testing DELETE with no children */
        //tree.delete(15);
        //assert tree.find(15) == null;

        /* Testing delete with one child */
        //tree.delete(16);
        //assert tree.find(16) == null;

        /* Test delete with two children */
        //tree.delete(8);
        //assert tree.find(8) == null;

        /* Test delete root */
        //tree.delete(23);
        //assert tree.find(23) == null;

        int[] myarray = new int[6];

        myarray[0] = 3;
        myarray[1] = 1;
        myarray[2] = 5;
        myarray[3] = 2;
        myarray[4] = 0;
        myarray[5] = 15;

        InsertionSort.sort(myarray);

        InsertionSort.sortDescending(myarray);

        int[] testArrayDivideAndConquer = new int[16];

        testArrayDivideAndConquer[0] = -13;
        testArrayDivideAndConquer[1] = 3;
        testArrayDivideAndConquer[2] = -25;
        testArrayDivideAndConquer[3] = 20;
        testArrayDivideAndConquer[4] = -3;
        testArrayDivideAndConquer[5] = -16;
        testArrayDivideAndConquer[6] = -23;
        testArrayDivideAndConquer[7] = 18;
        testArrayDivideAndConquer[8] = 20;
        testArrayDivideAndConquer[9] = -7;
        testArrayDivideAndConquer[10] = 12;
        testArrayDivideAndConquer[11] = -5;
        testArrayDivideAndConquer[12] = -22;
        testArrayDivideAndConquer[13] = 15;
        testArrayDivideAndConquer[14] = -4;
        testArrayDivideAndConquer[15] = 7;

        int[] result = MaximumSubarray.findMaxSubarray(testArrayDivideAndConquer, 0, 15);

        for(int i : result){
            System.out.println(result);
        }
    }
}
