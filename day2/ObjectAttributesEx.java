package com.zetcode;

class Person {

    public String name;
}

public class ObjectAttributesEx {

    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.name = "Jane";

        Person p2 = new Person();
        p2.name = "Beky";

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
