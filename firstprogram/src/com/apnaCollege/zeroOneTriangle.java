package com.apnaCollege;

import java.util.*;

public class zeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) a = 1;
//            else a = 0;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(a + " ");
//                if (a == 0) a = 1;
//                else a=0;
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }


    }
}
