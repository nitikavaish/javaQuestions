package com.apnaCollege.Recursion;

public class removeOccurrences {

    // approach 1
    public static String removeAlla(String s, int idx){
        if(idx==s.length()) return "";
        String smallAns=removeAlla(s,idx+1);
        char currChar=s.charAt(idx);
        if(currChar=='a'){
            return smallAns;
        }else{
            return currChar+smallAns;
        }
    }

    //approach 2
    public static String removeAlla2(String s){
        if(s.length()==0) return "";
        String smallAns=removeAlla2(s.substring(1));
        char currChar=s.charAt(0);
        if(currChar=='a'){
            return smallAns;
        }else{
            return currChar+smallAns;
        }
    }
    public static void main(String[] args) {
        String s= "abacx";
        System.out.println(removeAlla(s,0));
        System.out.println(removeAlla2(s));

    }
}
