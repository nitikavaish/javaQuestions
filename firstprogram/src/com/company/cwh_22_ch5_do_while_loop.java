package com.company;
import java.util.Scanner;
public class cwh_22_ch5_do_while_loop {
    public static void main(String[] args ){
        /*
        int i=10;
        do{
            System.out.println(i);
            i++;
        }while(i<5);
 execute atleast once

         */
        // quick quiz
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter nth number : ");
        int n;
        n=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
