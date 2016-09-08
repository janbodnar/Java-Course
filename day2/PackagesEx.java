package com.zetcode;

import java.util.Random;

public class PackagesEx {

    public static void main(String[] args) {
        
        Random r = new Random();
        
        int x = r.nextInt();
        System.out.println(x);
        
        java.util.Calendar c = java.util.Calendar.getInstance();
        System.out.println(c.getTime());    
    }
}
