package com.company;

public class CWH_10_resulting_data_type {
    public static void main(String[] args){
        int a=654+6;//int +int = int
        float b=6.54f+6;//int + float = float
        System.out.println(a);
        System.out.println(b);

        // increment and decrement operator
        int i=56;
        // int b=i++;// pahle value assign hogi fir inc --> assigned value 56
        int j=66;
        // int c=++i ; // pahle inc than assign --> assigned value 68
        System.out.println(i++);// first print than inc
        System.out.println(i);
        System.out.println(++i);// first inc than print
        System.out.println(i);
        // quiz 1
//        int x=5;
//        System.out.println(x++);
//        System.out.println(++x);
        // quiz 2
        int y=7;
        int x=++y*8;
        System.out.println(x);
        // value of x?
        // answer = 64.
         char ch='B';
        //a++;
        //a='C';
        System.out.println(ch++);
        System.out.println(ch);
    }
}
