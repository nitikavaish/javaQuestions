package com.practiceQuestions.main;
import java.util.*;
public class Divisible_by_5and3_not_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%3==0||n%5==0)&&n%15!=0){
            System.out.println(n+" is divisible by 5 or 3 but not 15");
        }
        else{
            System.out.println(" required condition not matched");
        }
    }
}
