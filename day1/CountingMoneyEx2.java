package com.zetcode;

import java.math.BigDecimal;

public class CountingMoneyEx2 {

    public static void main(String[] args) {
    
        BigDecimal c = new BigDecimal("1.46");
        BigDecimal sum = new BigDecimal("0");
        
        for (int i=0; i<100_000; i++) {
            
            sum = sum.add(c);
        }
        
        System.out.println(sum);                
    }
}
