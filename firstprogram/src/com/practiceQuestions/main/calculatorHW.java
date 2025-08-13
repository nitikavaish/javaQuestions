package com.practiceQuestions.main;

import java.util.*;

public class calculatorHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operator = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator) {
            case "+":
                int sum = a + b;
                System.out.println("sum " + sum);
                break;
            case "-":
                int subtraction = a - b;
                System.out.println("substraction " + subtraction);
                break;
            case "*":
                System.out.println("multiplication " + a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("invalid division");
                } else {
                    System.out.println("division " + a / b);
                }
                break;
            case "%":
                if (b == 0) {
                    System.out.println("invalid division");
                } else {
                    System.out.println("remainder " + a % b);
                }
                break;
            default:
                System.out.println("invalid button");

        }
    }
}
