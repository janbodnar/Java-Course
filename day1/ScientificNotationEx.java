package com.zetcode;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ScientificNotationEx {

    public static void main(String[] args) {        
        
        double n = 1.235E10;                        
        DecimalFormat dec = new DecimalFormat("#.00");
        
        System.out.println(dec.format(n));        
        
        BigDecimal bd = new BigDecimal("1.212e-19");
        
        System.out.println(bd.toEngineeringString());
        System.out.println(bd.toPlainString());                          
    }
}
