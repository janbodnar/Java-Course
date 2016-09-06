package com.zetcode;

public class LiteralsEx {

    public static void main(String[] args) {

        int age = 23;
        String name = "James";
        boolean sng = true;
        String job = null;
        double weight = 68.5;
        char c = 'J';

        System.out.format("His name is %s%n", name);
        System.out.format("His is %d years old%n", age);

        if (sng) {
            
            System.out.println("He is single");
        } else {
            
            System.out.println("He is in a relationship");
        }

        System.out.format("His job is %s%n", job);
        System.out.format("He weighs %f kilograms%n", weight);
        System.out.format("His name begins with %c%n", c);
    }
}
