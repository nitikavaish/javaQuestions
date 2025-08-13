package com.company;
// PROBLEM 1
//class Employee1{
//    int salary;
//    String name;
//   public  int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//   public  void setName(String n){
//        name =n;
//    }
//
//}
// PROBLEM 2
//class cellPhone{
//    public void ring(){
//        System.out.println(" Ringing...");
//    }
//    public void vibrate(){
//        System.out.println(" Vibrating...");
//    }
//    public void callFriend(){
//        System.out.println(" Calling Arti...");
//    }
//}
//PROBLEM 3
//class Square{
//    int side;
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//       return 4*side;
//    }
//}
// PROBLEM 4
//class rectangle{
//    int side1;
//    int side2;
//    public int area(){
//        return side1*side2;
//    }
//    public int perimeter(){
//        return 2*(side1+side2);
//    }
//}
// PROBLEM 6
//class circle{
//    int r;
//    public float area(){
//        return 3.14f*r*r;
//    }
//    public float perimeter(){
//        return 2*3.14f*r;
//    }
//}
// PROBLEM 5
class TommyVecetti{
    public void hit(){
        System.out.println(" Hitting the Enemy");
    }
    public void run(){
        System.out.println(" Running from the  Enemy");
    }
    public void fire(){
        System.out.println(" Firing on the Enemy");
    }
}

public class CWH_CH8_PS {
    public static void main(String[] args) {
        // problem 1
//       Employee1 E1 = new Employee1();
//       E1.setName("Nitya vaish");
//       E1.salary= 15000;
//        System.out.println(E1.getName());
//        System.out.println(E1.getSalary());
        // PROBLEM 2
//        cellPhone Samsung=new cellPhone();
//        Samsung.callFriend();
//        Samsung.vibrate();
//        Samsung.ring();
        // PROBLEM 3
//Square s1=new Square();
//        Square s2=new Square();
//
//s1.side=5;
//s2.side=3;
//System.out.println(" area of square s1 is "+s1.area()+" and area of square s2 is "+s2.area());
//System.out.println(" perimeter of square s1 is "+s1.perimeter()+" perimeter of square s2 is "+s2.perimeter());
        // PROBLEM 4
//        rectangle r1=new rectangle();
//        rectangle r2=new rectangle();
//
//        r1.side1=5;
//        r1.side2=3;
//        r2.side1=1;
//        r2.side2=3;
//        System.out.println(" area of rectangle r1 is "+r1.area()+" and area of rectangle r2 is "+r2.area());
//        System.out.println(" perimeter of rectangle r1 is "+r1.perimeter()+" perimeter of rectangle r2 is "+r2.perimeter());
          // PROBLEM 6
//        circle c1=new circle();
//        c1.r=5;
//        System.out.println(" area of cicle is "+c1.area());
//        System.out.println(" perimeter of cicle is "+c1.perimeter());
           // PROBLEM 5
TommyVecetti P1=new TommyVecetti();
        P1.hit();
        P1.run();
        P1.fire();
    }
}
