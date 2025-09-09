package com.apnaCollege.Recursion;
import java.util.*;
public class armstrongNumber {
    public static int countDigit(int x){
        if(x==0) return 0;
        return 1+countDigit(x/10);
    }
    public static int armstrongSum(int x,int power){
        int ld=x%10;
        if(x==0)return 0;
        return (int)Math.pow(ld,power)+armstrongSum(x/10,power);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int power=countDigit(x);
        int sum = armstrongSum(x,power);
        if(sum==x){
            System.out.println(" This is armstrong number");
        }else{
            System.out.println("This is not armstrong number");
        }
    }
}
