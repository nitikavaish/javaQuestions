package com.apnaCollege.stringss;

public class printLength {
    public static void main(String[] args) {
        // your code goes here

        String str = "Coding on CodeChef";
        int count = 0;
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
                count++;
            } else {
                System.out.println(sb + " - " + count);
                sb=new StringBuilder("");
                count = 0;
            }

        }
        System.out.println(sb+" - "+count);
        System.out.println(str+" - "+str.length());

    }


}



