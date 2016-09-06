package com.zetcode;

import java.util.Random;

public class BooleanTypeEx {

    public static void main(String[] args) {
        
        String name = "";
        Random r = new Random();
        boolean male = r.nextBoolean();

        if (male == true) {
            
            name = "Robert";
        }

        if (male == false) {
            
            name = "Victoria";
        }

        System.out.format("We will use name %s%n", name);

        System.out.println(9 > 8);
    }
}
