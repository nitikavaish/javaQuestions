package com.apnaCollege;

import java.util.*;

public class checkEvenUsingFunction {
    public static void checkEven(int n) {
        if (n == 0) {
            System.out.println(n + " is neutral number");
        } else {
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        checkEven(n);
    }
}
