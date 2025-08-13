package com.company;
class EkClass{
    int a;

    public int getA() {
        return a;
    }
    public EkClass(int a) {
        this.a = a;// agar aapne same variable liya hai to
        // variable ki value ko save karne me confusion na ho isiliye this
        // ka use karte hai.ye ek reference hai.
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);// bina super(c) ke error is liye aa rha tha kyuki default constructor nahi hai
        System.out.println(" I am a constructor");
    }
}
public class CWH_47_this_super {
    public static void main(String[] args) {
        EkClass e=new EkClass(65);
        DoClass d=new DoClass(5);
        System.out.println(e.getA());

    }
}
