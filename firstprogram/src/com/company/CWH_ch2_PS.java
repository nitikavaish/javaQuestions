package com.company;
import java.util.Scanner;

public class CWH_ch2_PS {
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);// obj of scanner
        System.out.println(" question 1");
        float c=7/4.0f*9/2.0f;
        // 1.75*9/2=15.75/2=7.875
        System.out.println(c);
        System.out.println(" question 2");
        char grade='B';
        // encrypt grade
        grade=(char)(grade+8);
        System.out.println(grade);

        // decryption
        grade=(char)(grade-8);
        System.out.println(grade);
        System.out.println("question no 3");
        int p=sc.nextInt();
        System.out.println(p<8);
          System.out.println(" question no 4");
          int u=5,v=7,a=5,s=10;
          float x=(v*v-u*u)/(2.0f*a*s);
        System.out.println(x);

        System.out.println(" question no 5");
        int y=7;
        int q=7*49/7+35/7;
        //343/7+35/7=49+5=54
        System.out.println(q);
    }
}
