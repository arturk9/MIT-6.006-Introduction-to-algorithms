package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int k = 3;
        int p = 4;

        int tmp = Integer.valueOf(k);

        k = p;
        p = tmp;

        System.out.println(tmp + " " + p + " " + k);
    }
}
