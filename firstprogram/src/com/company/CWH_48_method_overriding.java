package com.company;
class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println(" I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){ // implementation of meth2 from class A
        System.out.println(" I am method 2 of class B");
    }
    public void meth3(){
        System.out.println(" I am method 3of class B");
    }
}

public class CWH_48_method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();

        B b=new B();
        b.meth2();
    }
}
// method overriding ka matlab hai parent class ke method ko apni vlass me impliment karna us method k apni class ka batan
// for example class A ke method (meth2) ko class B me implement kiya
// or use apni class ka method bataya

// method overloading ka matlab hai same name ke methods ko
// use karna bas usme parameter alag alag dena hota hota hai

