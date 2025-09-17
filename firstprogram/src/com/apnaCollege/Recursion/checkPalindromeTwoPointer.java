package com.apnaCollege.Recursion;
import java.util.*;
public class reverseStringTwoPointer {
    public static boolean checkPalindrome(String s,int l,int r){
      if(l>=r) return false;
      if(s.charAt(l)==s.charAt(r)){
          return checkPalindrome(s,l+1,r-1);

      }else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean check=checkPalindrome(s,0,s.length()-1);
    }
}
