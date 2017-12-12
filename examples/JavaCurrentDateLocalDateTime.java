package com.zetcode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaCurrentDateLocalDateTime {

    public static void main(String[] args) {
        
        LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(now));
    }
}
