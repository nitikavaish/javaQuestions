package com.company;
import java.util.Scanner;
public class cwh_23_ch5_for_loop {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        // for loop--> when no of itretions are known

        /*
        for(int i=1; i<=10;i++){
            System.out.println(i);
        }
        System.out.println(" for loop executed ");
        */

        // quick quiz
       // System.out.print(" enter nth odd number : ");
        int n=sc.nextInt();
        System.out.println(" print odd numbers ");
// DECREMENT LOOP
        // QUICK QUIZ
        /*
        for(int i=n; i>0;i=i-2){
            System.out.println(i);
        }
        */
for(int i=n;i>0;i--){
    System.out.println(2*i-1);
}
        /*
        for(int i=0; i<n;i++){
           System.out.println(2*i+1);
        }
       */
    }
}
