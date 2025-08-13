package com.apnaCollege;

import java.util.*;

public class palindromePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            // 1st half numbers
            for (int j = i; j >= 1; j--) {
                    System.out.print(j);

            }
            // 2nd half numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
