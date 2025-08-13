package com.company;

import java.util.Scanner;

public class CWH_06_exercise_1 {
    public static void main(String[] args){
        System.out.println("taking input from users");
        Scanner marks=new Scanner(System.in);
        System.out.println("enter maximum marks");
        float  n= marks.nextFloat();
        System.out.println("enter physics marks");
        float p=marks.nextFloat();
        System.out.println("enter maths marks");
        float m=marks.nextFloat();
        System.out.println("enter chemistry marks");
        float c=marks.nextFloat();
        System.out.println("enter english marks");
        float e=marks.nextFloat();
        System.out.println("enter hindi marks");
        float h=marks.nextFloat();
        float per=(((p+c+m+h+e)*100)/5)/n;
        System.out.println("percentage of student");
        System.out.println(per);
    }
}
