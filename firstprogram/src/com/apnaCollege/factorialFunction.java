package com.apnaCollege;


import java.util.*;

public class factorialFunction {
    public static int calculateFactorial(int n) {

        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
        }
        return p;
//        if (n == 1 || n == 0) return 1; recursion
//        return n * calculateFactorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = calculateFactorial(n);
        System.out.println("factorial of " + n + " is " + fact);
    }
}
