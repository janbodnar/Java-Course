package com.zetcode;

public class PrimeNumbersEx {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8,
            9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
            19, 20, 21, 22, 23, 24};

        System.out.print("Prime numbers: ");

        for (int num : nums) {
            
            if (num == 1 || num == 2 || num == 3) {
                
                System.out.print(num + " ");
                continue;
            }

            int i = (int) Math.sqrt(num);

            boolean isPrime = true;

            while (i > 1) {
                
                if (num % i == 0) {
                    
                    isPrime = false;
                }
                
                i--;
            }

            if (isPrime) {
                
                System.out.print(num + " ");
            }
        }

        System.out.print('\n');
    }
}
