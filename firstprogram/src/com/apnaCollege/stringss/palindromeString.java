package com.apnaCollege.stringss;
import java.util.*;
public class palindromeString {
    public static void checkPalindrome(String s){
        int i=0,j=s.length()-1;
        boolean flag =true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true) System.out.println(" String is palindrome ");
        else System.out.println(" String is not palindrome ");
    }

    /*
    public static void usingStringBuilder(String s){
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        String rsb=sb+"";
        if(s.equals(rsb)){
            System.out.println("string is palindromic");
        }else{
            System.out.println("String is not palindromic ");
        }
    }

     */


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        checkPalindrome(s);
       // usingStringBuilder(s);
    }
}
