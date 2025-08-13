package com.apnaCollege;
import java.util.*;
public class Loops {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        // for loop

//        for (int i = 1; i <= 100; i++) {
//            System.out.println("Hello world");
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(i+" ");
//        }

        // while loop

//        int i=0;
//        while(i<11){
//            System.out.println(i+" ");
//            i++;
//        }

        // do-while

//        int i=0;
//        do{
//            System.out.println(i+" ");
//            i++;
//        }while(i<11);

        // test between while and do-while

//        int i=12;
//        while(i<11){
//            System.out.println("Apna College");
//        }
//
//        int i=12;
//        do{
//            System.out.println("Apna College");
//        }while(i<11);

        // quiz 1
// print sum of n natural numbers

//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println("sum of "+n+" natural numbers is "+sum);

        // print Table of number input by user

        System.out.println("enter number for table ");
        int t=sc.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(t+"x"+i+"="+t*i);
}
    }
}
