package com.company;
class Base1{
    Base1(){
        System.out.println(" I am a Constructor");
    }
    Base1(int a){
        System.out.println("i am an overloaded constructor with value of a as : "+a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(0); // agar mujhe base class ka argument wala constructor
        // run karna hai to mai super keyword ka use karke kar sakti hun.
        System.out.println(" I am a Derived class Constructor");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println( " I am an overloaded Derived constructor with value of b as : "+b);
    }
}
class childOfDerived extends Derived1{
    public childOfDerived() {
        System.out.println(" I am a child of derived constructor");
    }

    public childOfDerived(int a, int b,int c) {
        super(a, b);
        System.out.println(" i am a child of super derived overloaded constructor with value of c as : "+c);
    }
}
public class CWH_46_Constructors_In_Henritance {
    public static void main(String[] args) {
      //Base1 b=new Base1();
      //Derived1 d=new Derived1();
       // Derived1 d=new Derived1(14,9);
       //childOfDerived dc=new childOfDerived();
        childOfDerived dc=new childOfDerived(2,3,4);
    }
}
