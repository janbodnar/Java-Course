package com.zetcode;

import java.util.Random;

public class IfStatementEx {

    public static void main(String[] args) {
        
        Random r = new Random();
        int num = r.nextInt();

        if (num > 0) {

            System.out.println("The number is positive");
        }
    }
}
