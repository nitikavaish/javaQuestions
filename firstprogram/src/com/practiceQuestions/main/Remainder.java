package com.practiceQuestions.main;
import java.util.*;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // remainder
          if(a>b){
              int q=a/b;
              int r=a-b*q;
              System.out.println(r);
          }else{
              System.out.println("a is less than b");
          }
    }
}
