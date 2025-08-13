package com.apnaCollege;

import java.util.*;

public class permutationAndCombination {
    public static int calculateFactorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * calculateFactorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int nCr = calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
        System.out.println(nCr);


    }
}
