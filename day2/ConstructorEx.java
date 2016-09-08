package com.zetcode;

class Being {

    public Being() {
        
        System.out.println("Being is created");
    }

    public Being(String being) {
        
        System.out.println(String.format("Being %s is created", being));
    }
}

public class ConstructorEx {

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args) {
        
        new Being();
        new Being("Tom");
    }
}
