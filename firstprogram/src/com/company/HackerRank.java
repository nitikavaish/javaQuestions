package com.company;

import java.util.Scanner;

public class HackerRank {
        public static void main(String[] args){

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();// i entered 42
            // chnge into string
            String s=Integer.toString(n); // now string = "42"
            int N=Integer.parseInt(s);// string ko integer me change kiya ab n=42 ho gya jo ki maine enter kiya tha
            // iske baad maine n ko N se compare kiya
            if(n==N){
                System.out.println("Good job");
            }
            else{
                System.out.println("Wrong answer");
            }

        }


}
