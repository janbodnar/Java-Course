package com.zetcode;

public class ContinueStatementEx {

    public static void main(String[] args) {
        
        int num = 0;

        while (num < 100) {
            
            num++;

            if ((num % 2) == 0) {
                continue;
            }

            System.out.print(num + " ");
        }

        System.out.print('\n');
    }
}
