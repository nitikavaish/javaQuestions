package com.company;

import java.util.Locale;

public class cwh_ch3_PS {
 public static void main(String[] args){
     // problem 1
     String name = "Nitika Vaish" ;
     System.out.println(name.toLowerCase());
     // problem 2
     System.out.println(name.replace(' ','_'));
     // problem 3
     String letter = " Dear <|name|>, Thanks a lot ";
            letter= letter.replace("<|name|>","Nitika");
     System.out.println(letter);
     // problem 4
     String str = " This string contains  double spaces and   triple spaces";
     System.out.println(str.indexOf("  "));
     System.out.println(str.indexOf("   "));
     // problem 5
     String letter2 = "Dear Harry , \n\tThis Java Course is Nice.\n\tThanks! ";
     System.out.println(letter2);
 }
}