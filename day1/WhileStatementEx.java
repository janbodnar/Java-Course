package com.zetcode;

public class WhileStatementEx {

    public static void main(String[] args) {
        
        int i = 0;
        int sum = 0;

        while (i < 10) {
            
            i++;
            sum += i;
        }

        System.out.println(sum);
    }
}
