package com.apnaCollege;

import java.util.*;

public class checkPrimeUsingFunction {
    public static void checkPrime(int n) {
        if (n == 1 || n == 0) {
            System.out.println(n + " is neither prime nor composite");
        } else {
            boolean flag = true;// prime number
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is composite number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : " );
        int n = sc.nextInt();
        checkPrime(n);

    }
}
