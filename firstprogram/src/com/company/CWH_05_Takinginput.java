package com.company;
import java.util.Scanner;
public class CWH_05_Takinginput {
    public static void main(String[] args){
        System.out.println("taking input from the users");
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number 1");
//        int a=sc.nextInt();
//        float a=sc.nextFloat();
//        System.out.println("enter number 2");
//        int b=sc.nextInt();
//        float b=sc.nextFloat();
//      int sum=a+b;
//        float sum=a+b;
//        System.out.println("the sum of these numbers is ");
//        System.out.println(sum);
//boolean b1=sc.hasNextInt();
//        System.out.println(b1);
       //String str=sc.next(); SIRF EK word read karega

        String str =sc.nextLine();// pura sentence read karne ke liye next line method ka
        System.out.println(str);

    }
}
