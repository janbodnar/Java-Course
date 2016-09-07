package com.zetcode;

class Base {}
class Derived extends Base {}

public class InstanceOfOperatorEx {

    public static void main(String[] args) {
        
        Base b = new Base();
        Derived d = new Derived();
        
        System.out.println(d instanceof Base);
        System.out.println(b instanceof Derived);
        System.out.println(d instanceof Object);    
    }
}
