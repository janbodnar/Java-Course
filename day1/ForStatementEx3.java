package com.zetcode;

import java.util.Arrays;
import java.util.Random;

public class ForStatementEx3 {

    public static void main(String[] args) {
        
        Random r = new Random();

        int[] values = new int[10];
        int num;
        int sum=0;
        
        for (int i = 0; i < 10; i++, sum += num) {
            
            num = r.nextInt(10);
            values[i] = num;
        }

        System.out.println(Arrays.toString(values));
        System.out.println("The sum of the values is " + sum);
    }
}
