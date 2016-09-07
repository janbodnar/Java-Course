package com.zetcode;

public class TraversingArraysEx {

    public static void main(String[] args) {
        
        String[] planets = { "Mercury", "Venus", "Mars", "Earth", "Jupiter", 
            "Saturn", "Uranus", "Neptune", "Pluto" };
        
        for (int i=0; i < planets.length; i++) {
            
            System.out.println(planets[i]);
        }
        
        for (String planet : planets) {
            
            System.out.println(planet);
        }
    }
}
