package com.practiceQuestions.main;
import java.util.*;
public class checkDigit {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      while(n!=0)
      {
          n=n/10;
          count++;
      }
       //  System.out.println("it is "+count+" digit number");
        //if you have to check it is 3 digit number
        if(count==3){
            System.out.println("it is three digit number");
        }
        else{
            System.out.println("it is not three digit number");
        }

    }
}
