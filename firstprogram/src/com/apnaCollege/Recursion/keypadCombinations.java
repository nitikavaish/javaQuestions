package com.apnaCollege.Recursion;

import java.util.*;

public class keypadCmbinations {
    public static void printCombinations(String dig,String []kp,String res) {// "235"
     if(dig.length()==0){
         System.out.print(res+" ");
         return ;
     }
     int currNum=dig.charAt(0)-'0'; // current number matlab 2 press karne par kon
        // kon si choices hai
     String currChoices=kp[currNum];
     for(int i=0;i<currChoices.length();i++){
         printCombinations(dig.substring(1),kp,res+currChoices.charAt(i));
     }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter digit any digits from 2 to 9
        String s = sc.next();
        String [] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //indices       0  1   2     3     4     5     6      7     8     9
        String res="";
        printCombinations(s,kp,res);
    }
}
