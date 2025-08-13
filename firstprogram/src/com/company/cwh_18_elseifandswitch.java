package com.company;
import java.util.Scanner;
public class cwh_18_elseifandswitch {
    public static void main(String[] args) {
        int age;
        System.out.print(" Enter Your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
         switch (age){
             case 18:
                 System.out.println(" You are going to become an Adult");
                 break;// break means tod do aur bahar aa jao
             case 23:
                 System.out.println(" You are going to join a job ");
            break;
             case 60:
                 System.out.println(" You are getting retired ");
         break;
             default:
             System.out.println(" Enjoy Your Life!");
         }
        /*--> for comment out
        if (age > 56) {
            System.out.println(" you are experienced ");
        } else if (age > 46) {
            System.out.println(" you are semi-experienced");
        } else if (age > 36) {
            System.out.println("you are semi-semi-experienced ");
        } else {
            System.out.println(" you are not experienced ");
        }
        if(age>2){
            System.out.println(" you are not a baby");
        }

         */

    }
}