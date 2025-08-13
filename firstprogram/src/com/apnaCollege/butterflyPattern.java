package com.apnaCollege;

import java.util.*;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // upper half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int sp = 1; sp <= 2 * (n - i); sp++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int sp = 1; sp <= 2 * (n - i); sp++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
