package com.company;
class Base{
   public  int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println(" I am in Base and setting x now!");
        this.x = x;
    }

    public void printMe(){

        System.out.println(" I am a Constructor");
    }
}
class Derived extends Base{
   public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println(" I am in Derived and setting Y now!");
        this.y = y;
    }
}
// QUICK QUIZ
class Animal{
    public int eyes;
   public  int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        System.out.println("setting legs of animal");
        this.legs = legs;
    }

    public int getEyes() {
        System.out.println("setting eyes of animal");
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

}
class Dog extends Animal{
   public String speek;

    public String getSpeek() {
        return speek;
    }

    public void setSpeek(String speek) {
        this.speek = speek;
    }
}

public class CWH_45_Inheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());
        Derived d=new Derived();
        d.setY(45);
        System.out.println(d.getY());

        // QUICK QUIZ...


        Dog D= new Dog();
        D.setEyes(2);
        System.out.println(D.getEyes());
        D.setLegs(4);
        System.out.println(D.getLegs());
        D.setSpeek(" Barking");
        System.out.println(D.getSpeek());



    }
}
