package com.zetcode;

public class EnhancedForEx {

    public static void main(String[] args) {
        
        String[] planets = {
            "Mercury", "Venus", "Earth",
            "Mars", "Jupiter", "Saturn", "Uranus", "Pluto"
        };

        for (String planet : planets) {
            
            System.out.println(planet);
        }
    }
}
