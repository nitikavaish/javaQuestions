package com.apnaCollege.Recursion;

import java.lang.reflect.Array;
import java.util.*;

public class returnSSQ {
//    public static ArrayList<String> getSSQ(String s) {
//        ArrayList<String> ans = new ArrayList<>();
//        // base case
//        if (s.length() == 0) {
//            ans.add("");
//            return ans;
//        }
//
//        char curr = s.charAt(0);
//        ArrayList<String> smallAns = getSSQ(s.substring(1));
//        // smallAns=["bc", "b", "c", ""]
//        // ans = ["bc", "abc", "b", "ab", "c", "ac", "", "a"]
//        for (String ss : smallAns) {
//            ans.add(ss);  // ""
//            ans.add(curr + ss);  // "a"
//        }
//        return ans;
//    }
    public static void printSSQ(String s,String currAns){
        if(s.length()==0){
            System.out.print(currAns+" ");
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        // curr chooses the part of ans
        printSSQ(remString,currAns+curr);

        // curr does not choos the part of ans
        printSSQ(remString,currAns);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(getSSQ(s));
        printSSQ(s,"");
    }
}
