package com.practiceQuestions.main;
import java.util.*;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        if (x>0){
            System.out.println("absolute value is "+x);
        }
        else{
            x=x*(-1);
            System.out.println("absolute value is "+x);
        }
    }
}
