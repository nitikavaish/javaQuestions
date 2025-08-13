package com.apnaCollege;

import java.util.*;

public class sumOfTwoNumbers {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum of two numbers is " + Sum(a, b));

    }
}
