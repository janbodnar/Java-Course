package com.zetcode;

public class SprinterEx {

    public static void main(String[] args) {
        
        float distance;
        float time;
        float speed;

        distance = 0.1f;
        
        time = 9.87f / 3600;

        speed = distance / time;

        System.out.format("The average speed of a sprinter is %f km/h%n", speed);
    }
}
