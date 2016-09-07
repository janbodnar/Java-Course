package com.zetcode;

import java.util.Calendar;

public class FormatDateTimeEx {

    public static void main(String[] args) {
               
        Calendar c = Calendar.getInstance();
        
        System.out.format("%tF%n", c);
        System.out.format("%tD%n", c);
        System.out.format("%tT%n", c);
        
        System.out.format("%1$tA,%1$tb %1$tY%n", c);
        System.out.format("%1$td.%1$tm.%1$tY%n", c);
        
        System.out.format("%ts%n", c);            
    }
}
