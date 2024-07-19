package com.chainsys.day8;

import java.util.Scanner;

class UsernameValidator {

    public static final String regularExpression =  "[A-Za-z]{1}[A-Za-z0-9_]{7,29}";
}


public class UserName {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        while (n-- != 0) {
            String userName = sc.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}