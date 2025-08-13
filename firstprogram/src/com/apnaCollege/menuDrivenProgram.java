package com.apnaCollege;
import java.util.*;
public class menuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       // System.out.print("Enter 0 or 1");
        int n;

        do{

            System.out.println("enter marks of student out of hundred");
            int marks=sc.nextInt();
            if(marks>=90){
                System.out.println("this is Good");
            }else if(marks>=60&&marks<=89){
                System.out.println("This is also ggood");
            }else if(marks<=59&&marks>=0){
                System.out.println("This is Good as well");
            }else{
                System.out.println("invalid");
            }
            // if n=1 taking input
            // if n=0 stop input
            System.out.println("enter 0 either 1");
            n=sc.nextInt();

        }while(n==1);

    }
}
