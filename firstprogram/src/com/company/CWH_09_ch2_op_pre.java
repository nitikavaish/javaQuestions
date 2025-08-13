package com.company;

public class CWH_09_ch2_op_pre {
    public static void main(String[] args){
       // int a=6*5-34/2;
        // highest precedence goes to * & /
        // * and / have same precedence
        // * in left --> calculate first due to associativity left to right
        // 30-17=13
       // System.out.println(a);
      //  int b= 60/5-34*2;
        // 12-34*2
        //12-68=-56
       // System.out.println(b);
        // precedence and associativity
        // jiski precedence jyada hai vo pahle evaluate hoga
        //or agar precedence equal hai to associativity ke rules ke hisab se
        // jo pahle aayega left to right wo evaluate hoga
        // example = / and * isme left to right jane pr / aa rha hai
        // to pahle / calculate hoga
       // quick quiz
//        int x=6;
//        int y=1;
//        int k= x*y/2;
//        System.out.println(k);
        int b=1;
        int c=4;
        int a=5;
        int k=(b*b-4*a*c)/(2*a);
        System.out.println(k);


    }
}
