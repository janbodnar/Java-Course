package com.zetcode;

import java.math.BigInteger;

public class VeryLargeIntegersEx {

    public static void main(String[] args) {
        
        System.out.println(Long.MAX_VALUE);
        
        BigInteger b = new BigInteger("92233720368547758071");
        BigInteger c = new BigInteger("52498235605326345645");
               
        BigInteger a = b.multiply(c);
        
        System.out.println(a);            
    }
}
