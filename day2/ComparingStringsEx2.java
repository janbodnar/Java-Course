package com.zetcode;

import java.util.Random;

public class ComparingStringsEx2 {
    
    public static String readString() {
        
        Random r = new Random();
        boolean b = r.nextBoolean();
        
        if (b == true) {
            
            return "ZetCode";
        } else {
            
            return null;
        }                
    }

    public static void main(String[] args) {

        String d = readString();
                
        if ("ZetCode".equals(d)) {
            
            System.out.println("Strings are equal");
        } else {
            
            System.out.println("Strings are not equal");
        }                            
    }
}
