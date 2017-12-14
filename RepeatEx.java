package com.zetcode;

import java.util.Random;

public class RepeatEx {

    // this is RepeatEx.java program
    
    public static void main(String[] args) {
        
        int x = 2;
        int y = 5;
        
        if (x < y) {
            
            System.out.println("x is lower than y");
        }
        
        int z = Math.max(x, y);
        System.out.println(z);
        
        String word = "Eagle";
        System.out.printf("%s has %d characters%n", word, word.length());
        
        Random r = new Random();
        System.out.println(r.nextInt(10));
        
    }
}
