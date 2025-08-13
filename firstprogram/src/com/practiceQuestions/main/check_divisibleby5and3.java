package com.practiceQuestions.main;

import java.util.*;

public class check_divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 5 == 0) {
            if (n % 3 == 0) {
                System.out.println(" n is divisible by 5 and 3");
            } else {
                System.out.println("divisible by 5 not 3");
            }
        } else {
            System.out.println(" n is not divisible by 5 and 3 both");
        }
    }
}
