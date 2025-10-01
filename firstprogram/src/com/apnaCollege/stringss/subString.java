package com.apnaCollege.stringss;

public class subString {
    public static void main(String[] args) {
//        String str="Nitika ";
//        System.out.println(str.substring(0,2));
//        System.out.println(str.substring(2));
        String s="abcd";
       // System.out.println(s.length());
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }

//        String str="a";
//        str+='b';
//        str+='c';
//        System.out.println(str);


    }
}
