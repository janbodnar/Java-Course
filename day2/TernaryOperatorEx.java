package com.zetcode;

public class TernaryOperatorEx {

    public static void main(String[] args) {
        
        int age = 31;

        boolean adult = age >= 18 ? true : false;

        System.out.println(String.format("Adult: %s", adult));    
    }
}
