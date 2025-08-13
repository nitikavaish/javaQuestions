package com.apnaCollege;

import java.util.*;

public class checkPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (n != 0&&n!=1) {
            boolean a = true;// prime number
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    a = false;
                    break;
                }
            }
            if (a == true) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        } else {
            System.out.println(n+" is neither prime not composite");
        }


        // ma'am code


//        Scanner sc=new Scanner(System.in);
//                int n = sc.nextInt();
//
//                boolean isPrime = true;
//                for(int i=2; i<=n/2; i++) {
//                    if(n % i == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//        if(isPrime) {
//            if(n == 1) {
//                System.out.println("This is neither prime not composite");
//            } else {
//                System.out.println("This is a prime number");
//            }
//        } else {
//            System.out.println("This is not a p");
//                }
  }
}
