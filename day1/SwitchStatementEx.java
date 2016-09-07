package com.zetcode;

import java.util.Scanner;

public class SwitchStatementEx {

    public static void main(String[] args) {
        
        System.out.print("Enter a domain:");

        Scanner sc = new Scanner(System.in);
        String domain = sc.nextLine();

        domain = domain.trim().toLowerCase();

        switch (domain) {

            case "us":
                System.out.println("United States");
                break;

            case "de":
                System.out.println("Germany");
                break;

            case "sk":
                System.out.println("Slovakia");
                break;

            case "hu":
                System.out.println("Hungary");
                break;

            default:
                System.out.println("Unknown");
                break;
        }
    }
}
