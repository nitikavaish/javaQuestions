package com.apnaCollege.Recursion;

import java.util.*;

public class fibonacci {

public static int fibonacci(int n) {

    if (n == 0 || n == 1) {
        return n;
    }

    else {
        return (fibonacci(n-1)+fibonacci(n-2));

    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }

       // System.out.println(fibonacci(n));
    }
}
