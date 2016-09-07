package com.zetcode;

import java.util.Arrays;

public class ComparingArraysEx {

    public static void main(String[] args) {
        
        int[] a = {1, 1, 2, 1, 1};
        int[] b = {0, 0, 3, 0, 0};
        
        int[][] c = {
            {1, 1, 2, 1, 1},
            {0, 0, 3, 0, 0}
        };
        
        int[][] d = {
            a,
            b
        };       
        
        System.out.print("equals() method: ");
        
        if (Arrays.equals(a, b)) {

            System.out.println("Arrays a, b are equal");
        } else {

            System.out.println("Arrays a, b are not equal");
        }            
        
        if (Arrays.equals(c, d)) {

            System.out.println("Arrays c, d are equal");
        } else {

            System.out.println("Arrays c, d are not equal");
        }      
        
        System.out.print("deepEquals() method: ");
        
        if (Arrays.deepEquals(c, d)) {

            System.out.println("Arrays c, d are equal");
        } else {

            System.out.println("Arrays c, d are not equal");
        }            
    }
}
