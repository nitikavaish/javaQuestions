package com.apnaCollege.stringss;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        // PHysiCs --> phYSIcS
        for(int i=0;i<str.length();i++){
            // P -> p
            // check -> alphabet - small, capital
            boolean flag=true; // true -> capital letter
            char ch=str.charAt(i);
            if( ch==' ') continue;
            int asci=(int)ch;
            if(asci>=97) flag=false;  // false -->small letter
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);

            }
        }
        System.out.println(str);

    }
}
