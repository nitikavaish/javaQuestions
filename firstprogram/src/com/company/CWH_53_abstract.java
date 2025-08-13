package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor of base");

    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Child3 extends Parent2{
public void th(){
    System.out.println("i am a good boy");
}
}
public class CWH_53_abstract {
    public static void main(String[] args) {
        // Parent2 p=new Parent2();--> not possible kyuki wo real me koi class nahi hai wo abstract hai
        Child2 c=new Child2(); // possible beause ye ek concrete class hai
        Parent2 p=new Child2();
    }
}
