package com.zetcode;

public class CountingMoneyEx {

    public static void main(String[] args) {
        
        float c = 1.46f;
        float sum = 0f;
        
        for (int i=0; i<100_000; i++) {
            
            sum += c;
        }
        
        System.out.println(sum);     
    }
}
