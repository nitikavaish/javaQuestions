package com.company;
import java.util.Scanner;
public class CWH_34_Recursion {
//    static int factorial(int n){
//        if(n==0||n==1){
//          return 1;
//        }
//        else{
//           return n*factorial(n-1);
//        }
//    }
static int factorial_iterative(int n){
    if(n==0||n==1){
        return 1;
    }
    else{
        int product=1;
        for(int i=1; i<=n; i++){
            product*=i;
        }
        return product;
    }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter n : ");
        int n=sc.nextInt();
        // long fact= factorial(n);
         long fact= factorial_iterative(n);
      System.out.println(" factorial of " +n+ " is " +fact);
    }
}