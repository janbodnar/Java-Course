package com.zetcode;

class Being {

    public Being() {

        System.out.println("Being is created");
    }
}

class Human extends Being {

    public Human() {

        System.out.println("Human is created");
    }
}

public class InheritanceEx {

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args) {
        
        new Human();
    }
}
