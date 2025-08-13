package com.apnaCollege;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operator = sc.next();
        int a=sc.nextInt();
        int b =sc.nextInt();
        switch (operator) {
            case "+":
                System.out.println("Add two numbers a+b");
                break;
            case "*":
                System.out.println("multiply two numbers a*b ");
                break;
            case "-":
                System.out.println("substract two numbers a-b");
                break;
            case "/":
                if(b==0){
                    System.out.println("invalid division");
                }else{
                System.out.println("divide two numbers a/b");}
                break;
            default:
                System.out.println("error");


        }

    }
}
