package com.company;
//problem 1
/*
class Circle1{
    public int radius;
    public Circle1(){
        System.out.println(" Iam non param cons");
    }
    public Circle1(int r) {
        System.out.println(" i am a circle parameterise constructor");
        this.radius = r;
    }
    public double area(){
        System.out.print(" area of circle is ");
        return Math.PI*this.radius*this.radius;
    }


 }
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
    super(r);
        System.out.println(" I am cylinder parameterise constructor");
    this.height=h;
    }

    public double Volume(){
        System.out.print(" volume of cylinder is ");
        return Math.PI*this.radius*this.radius*this.height;
    }
}
*/


//

// problem 2

class Rectangle {
    int l;
    int b;

//    public Rectangle(int l, int b) {
//        this.l = l;
//        this.b = b;
//    }

    public int area() {
        System.out.println(" area of rectangle is ");
        return l * b;
    }
}

class cuboid extends Rectangle {
    int h;
    int volume;


//    public cuboid(int l, int b, int h) {
//        super(l, b);
//        this.h = h;
//    }

    public int volume() {
        System.out.println(" volume of cuboid is ");
        return l * b * h;

    }
}


public class CWH_CH10_PS {
    public static void main(String[] args) {
//         problem 1
       /*
      Cylinder1 obj=new Cylinder1(1,2);
      // problem 3
       System.out.println(obj.area());
       System.out.println(obj.Volume());
        */

        // problem 2

       // Rectangle r = new cuboid(1, 1, 1);
       // cuboid c = new cuboid(2, 2, 2);

        // problem 4

        // System.out.println(r.area());
       // System.out.println(c.volume());



    }
}
