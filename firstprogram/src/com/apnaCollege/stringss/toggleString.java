package com.apnaCollege.stringss;

public class toggleString {
    public static void main(String[] args) {
        String str = "PHYSICS WALLAH";
        // StringBuilder sb=new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // capital
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            int asci = (int) ch;
            if (asci >= 97) flag = false;   /// small leter
            if (flag == true) {
                asci += 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            } else {
                asci -= 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);

            }

        }
        System.out.println(str);

    }
}
