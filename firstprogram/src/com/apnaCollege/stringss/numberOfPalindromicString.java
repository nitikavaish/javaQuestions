package com.apnaCollege.stringss;

import java.util.*;

public class numberOfPalindromicString {
    public static boolean isPalindromic(@org.jetbrains.annotations.NotNull String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*
    public static int usingStringBuilder(String s) {
        int count = 0;
        for (int i = 0; i <s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String gtr = s.substring(i, j);
               // System.out.println(gtr);
                StringBuilder sb=new StringBuilder(gtr);
                 sb.reverse();
                //System.out.println(sb);
                String rgtr=sb+"";
                if (gtr.equals(rgtr)) {    // abc
                    count++;
                }

            }
        }
        return count;
    }

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        //  System.out.println(usingStringBuilder(str));
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (isPalindromic(str.substring(i, j)) == true) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
        }
        System.out.println(" number of palindromic substring are " + count);
    }
}
