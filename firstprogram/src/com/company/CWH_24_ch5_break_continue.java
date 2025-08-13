package com.company;
import java.util.Scanner;
public class CWH_24_ch5_break_continue {
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);
         // BREAK
        /*
        for( int i=0;i<5;i++){
            System.out.print(i);
            System.out.println(" Java is Great");
            if(i==2){
             System.out.println(" Ending the loop ");
             break;

            }
       }

         */
        // CONTINUE
        for(int i=0;i<5;i++){
            if(i==2){
                System.out.println(" Ending the loop");
                continue;
            }
            System.out.print(i);
            System.out.println(" java is great ");
        }
    }
}
