package com.company;
import java.util.Scanner;
public class CWH_26_arrays {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   // 1.> int [] marks; // declaration
        // marks =new int[5];// memory allocation
         //2.> declaration + memory allocation
        // int [] arr = new int[5];
//        marks[0]=100;
//        marks[1]=68;
//        marks[2]=78;
//        marks[3]=98;
//        marks[4]=96;
        // marks[5]=96;--> throws an error
        //3.> declaration + initialization + memory allocation
        int [] marks ={100,68,78,98,96};
        System.out.println(marks[4]);
    }
}
