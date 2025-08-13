package com.practiceQuestions.main;
import java.util.*;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter cost price ");
        int cp=sc.nextInt();
        System.out.println("enter selling price ");
        int sp=sc.nextInt();
        if(cp>sp){
            int l=cp-sp;
            System.out.println("loss is "+l);
        }
        else if(sp>cp){
            int p=sp-cp;
            System.out.println("profit is "+p);
        }
        else{
            System.out.println(" no profit no loss");
        }
    }
}
