package com.apnaCollege.Recursion;
import java.util.*;
public class KMultiplesofNum {
    public static void KMultiplesOfNum(int n,int k){
        if(k<=0)return;
        KMultiplesOfNum(n,k-1);
        System.out.print(n*k+" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n ");
        int n=sc.nextInt();
        System.out.println("Enter k ");
        int k=sc.nextInt();
        KMultiplesOfNum(n,k);

    }
}
