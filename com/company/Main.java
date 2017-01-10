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

        /* Test finding max sub array - case 1 */

        int[] testMaxSubarrayCase1 = new int[16];

        testMaxSubarrayCase1[0] = 13;
        testMaxSubarrayCase1[1] = -3;
        testMaxSubarrayCase1[2] = -25;
        testMaxSubarrayCase1[3] = 20;
        testMaxSubarrayCase1[4] = -3;
        testMaxSubarrayCase1[5] = -16;
        testMaxSubarrayCase1[6] = -23;
        testMaxSubarrayCase1[7] = 18;
        testMaxSubarrayCase1[8] = 20;
        testMaxSubarrayCase1[9] = -7;
        testMaxSubarrayCase1[10] = 12;
        testMaxSubarrayCase1[11] = -5;
        testMaxSubarrayCase1[12] = -22;
        testMaxSubarrayCase1[13] = 15;
        testMaxSubarrayCase1[14] = -4;
        testMaxSubarrayCase1[15] = 7;

        int[] maxSubarrayCase1Result = MaximumSubarray.find(testMaxSubarrayCase1);

        assert maxSubarrayCase1Result[0] == 7;
        assert maxSubarrayCase1Result[1] == 10;
        assert maxSubarrayCase1Result[2] == 43;

        /* Test finding max sub array - case 2 */

        int[] testMaxSubarrayCase2 = new int[9];
        testMaxSubarrayCase2[0] = -2;
        testMaxSubarrayCase2[1] = 1;
        testMaxSubarrayCase2[2] = -3;
        testMaxSubarrayCase2[3] = 4;
        testMaxSubarrayCase2[4] = -1;
        testMaxSubarrayCase2[5] = 2;
        testMaxSubarrayCase2[6] = 1;
        testMaxSubarrayCase2[7] = -5;
        testMaxSubarrayCase2[8] = 4;

        int[] maxSubarrayCase2Result = MaximumSubarray.find(testMaxSubarrayCase2);

        assert maxSubarrayCase2Result[0] == 3;
        assert maxSubarrayCase2Result[1] == 6;
        assert maxSubarrayCase2Result[2] == 6;


    }
}
