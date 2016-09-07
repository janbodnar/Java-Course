package com.zetcode;

public class AssociativityEx {

    public static void main(String[] args) {

        int a, b, c, d;
        a = b = c = d = 0;

        String str = String.format("%d %d %d %d", a, b, c, d);
        System.out.println(str);

        int j = 0;
        j *= 3 + 1;
        System.out.println(j);
    }
}
