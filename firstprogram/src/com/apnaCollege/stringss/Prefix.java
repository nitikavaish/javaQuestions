package com.apnaCollege.stringss;

public class Prefix {
    public static String longestCommonPrefix(String[] strs){
        if(strs==null||strs.length==0){
            return "";
        }
        String prefix=strs[0]; // first word=flower
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){ // checking flower is substring of flow (strs[1])
                prefix=prefix.substring(0,prefix.length()-1); // flower --> flowe
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
