package com.zetcode;

public class PrecedenceEx {

    public static void main(String[] args) {
        
        System.out.println(3 + 5 * 5);
        System.out.println((3 + 5) * 5);

        System.out.println(! true | true);
        System.out.println(! (true | true));    
    }
}
