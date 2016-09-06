package com.zetcode;

public class KeywordsEx {

    public static void main(String[] args) {

        final int ADULT_AGE = 18;
        int age = 19;
        
        if (age > ADULT_AGE) {
            System.out.println("Driving licence can be issued");
        } else {
            System.out.println("Driving license cannot be issued");
        }
    }
}
