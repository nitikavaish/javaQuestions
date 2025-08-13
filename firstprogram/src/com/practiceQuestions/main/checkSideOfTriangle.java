package com.practiceQuestions.main;

import java.util.*;

public class checkSideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("They can be sides of triangle");
        } else {
            System.out.println("they are not sides of triangle");
        }
    }
}
