package com.apnaCollege;
import java.util.*;
public class fibonacciSeries {
    public static int  fibonacci(int n){
        int a=1;
        int b=1;
        int sum=1;
        for(int i=1;i<=n-2;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
      //  System.out.println("the fibonacci of "+n+" is "+sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
       // fibonacci(n);
        for(int i=1;i<=n;i++){
            System.out.println("The fibonacci of "+i+" is "+fibonacci(i));
        }
    }
}
