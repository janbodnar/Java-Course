package com.zetcode;

import java.time.Instant;

public class JavaCurrentDateInstant {

    public static void main(String[] args) {
        
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
