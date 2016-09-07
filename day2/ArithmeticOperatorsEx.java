package com.zetcode;

public class ArithmeticOperatorsEx {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 11;
        int c = 12;

        int add = a + b + c;
        int sb = c - a;
        int mult = a * b;
        int div = c / 3;
        int rem = c % a;

        System.out.println(add);
        System.out.println(sb);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(rem);
    }
}
