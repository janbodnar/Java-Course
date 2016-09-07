package com.zetcode;

import java.util.Arrays;

public class SearchingArrayEx {

    public static void main(String[] args) {
        
        String[] planets = { "Mercury", "Venus", "Mars", "Earth", "Jupiter", 
            "Saturn", "Uranus", "Neptune", "Pluto" };
        
        Arrays.sort(planets);
        
        String p = "Earth";
               
        int r = Arrays.binarySearch(planets, p);
        
        String msg;
        
        if (r >= 0) {
            msg = String.format("%s was found at position %d of the "
                    + "sorted array", p, r);            
        } else {
            msg = p + " was not found";
        }              
        
        System.out.println(msg);    
    }
}
