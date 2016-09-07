package com.zetcode;

public class ConcatenateStringsEx {

    public static void main(String[] args) {
    
        System.out.println("Return" + " of " + "the king.");
        System.out.println("Return".concat(" of ").concat("the king."));
        
        StringBuilder sb = new StringBuilder();
        sb.append("Return");
        sb.append(" of ");
        sb.append("the king.");
        
        System.out.println(sb);
    }
}
