package com.apnaCollege.Recursion;
import java.util.*;
public class GCD {
    // brute force approach
//    public static int findGCD(int x,int y){
//        int HCF=1;
//        for(int i=Math.min(x,y);i>0;i--){
//            if(x%i==0&&y%i==0){
//                HCF=i;
//                break;
//            }
//        }
//        return HCF;
//    }

    //  itretive approach

//    public static int findGCD(int x,int y){
//        int r=0;
//       while(x%y!=0){
//           r=x%y;
//           x=y;
//           y=r;
//       }
//       return y;

    // recursive approach
    public static int findGCD(int x,int y) {
        if(y==0) return x;
        return findGCD (y,x%y);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(findGCD(x,y));

    }
}
