package com.apnaCollege;
import java.util.*;
public class Conditions {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        // if else
        /*
        System.out.print("enter your age : ");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are not adult");
        }

         */
        /*
        System.out.print("Enter a number : ");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

         */
        // Else-if
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        if(a>b){
//            System.out.println(" a is greater than b");
//        }
//        else if(a==b){
//            System.out.println(" a is equal to b");
//        }
//        else{
//            System.out.println("a is less than b");
  //      }

        // switch and break
            int button =sc.nextInt();
           switch(button){
           case 1:
               System.out.println("Hello");
               break;
           case 2:
               System.out.println("Namaste");
               break;
           case 3:
               System.out.println("Bonjour");
               break;
           default:
               System.out.println("invalid button");
           }



    }
}