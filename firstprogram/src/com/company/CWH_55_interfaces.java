package com.company;

interface Bicycle {
    int a = 100;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle {
    int x= 100;// properties ko implement karna jaroori nahi hai but method ko implement karna jaroori hai
    void blowHornK3g();
    void blowhornmhn();
}
// interface ke andar define properties or method publix hote hai
// unhe exclusively likhne ki need nahi hai

class AvonCycle implements Bicycle,HornBicycle {
    // public int x=5;
    void blowHorn() {
        System.out.println(" pee Pee Poo Poo");
    }

    public void applyBreak(int decrement) {
        System.out.println("applying brake ");
        //speed=speed-decrement;
        // System.out.println(speed);
    }

    public void speedUp(int increment) {
        System.out.println(" accelerate cycle");
        //speed = speed +increment;
        // System.out.println(speed);
    }

   public void blowHornK3g() {
       System.out.println(" kabhi khish kabhi gam pee pee pee");
   }

    public void blowhornmhn() {
        System.out.println(" main hoon na poo poo ");
    }
}

public class CWH_55_interfaces {
    public static void main(String[] args) {
        //Bicycle b=new Bicycle();
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBreak(1);
        // you can create property in interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // you can modify properties in interfaces as they are final
        // cycleHarry.speed=454;
        // System.out.println(cycleHarry.speed);

        cycleHarry.blowhornmhn();
        cycleHarry.blowHornK3g();

    }
}
