package com.zetcode;

public class ComparingStringsEx {

    public static void main(String[] args) {

        String a = "book";
        String b = "Book";
        
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));                        
    }
}
