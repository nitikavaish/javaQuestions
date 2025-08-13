package com.company;

public class CWH_8_ch2_operators {
    public static void main(String[] args){
        // airthmatic operator
        int a=6;
        int b=10+a;// here 10 and a are operands and + is operator
        int c=b%a;// % = modulo operator gives remainder
        // assignment operator
        b*=10;// b=b*10 System.out.println(c);
        System.out.println(b);
        // comparison operator
        System.out.println(6==8);// cmparison
        System.out.println(64>6);
        // logical operator
        System.out.println(64>5&&64>8);//&&= dono condition true ho
        System.out.println(64>1||64>68);// ||= koi ek condition true ho
        //bitwise operator--> phle binary me change karega fir bit wise bit operate karega
        System.out.println(2&3);
        // 2 in binary=10--> false by using and operator
        // 3 in binary=11--> true  by using and operator
        // result = false & true=false=10=2--> answer is 2
        // = means value assign karna -->assignment
        //== means compare karna--> comparison
    }
}
