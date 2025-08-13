package com.company;

public class cwh_17_logical {
    public static void main(String[] args) {
        System.out.println(" for lagical AND");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c) {
            System.out.println("Y");// Y--> true
        } else {
            System.out.println("N");// N--> false
        }
        System.out.println(" for logical OR ");
        boolean P = false;
        boolean Q = false;
        boolean R = false;
        if (P || Q || R) {
            System.out.println("Y");// Y--> true
        } else {
            System.out.println("N");// N--> false
        }
        System.out.println(" for logical NOT ");
        System.out.print("not(a) is ");
        a=!a;
        System.out.println(a);
        System.out.print(" not(b) is ");
        System.out.println(!b);
    }
}

