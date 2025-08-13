package com.company;
class Phone{
    public void showTime (){
        System.out.println("Time is 8pm");
    }
    public void On(){
        System.out.println(" Turning on phone....");
    }
}
class SmartPhone extends Phone{
    public void Music(){
        System.out.println("Play Music...");
    }
    @Override
    public void On(){
        System.out.println("Turning on SmartPhone....");
    }
    // override karne se aap sare super class ke method sub class me run kar sakte ho
    // par sub class ka method run karne ke liye aapko sub clas ka a;ag se obj banana padega

}

public class CWH_49_Dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj=new Phone(); // make at runtime
        //SmartPhone smobj=new SmartPhone();
        //obj.Name();

        Phone obj = new SmartPhone();// allowed
        // SmartPhone obj2=new Phone(); --> not allowed
        // aap super class ka reference dekar sub class ka object
        // bana sakte hai.
        obj.showTime(); // run time pr decide hota hai kon sa method run hona hai
        obj.On(); // object ka method run hoga i mean sub class ka
        SmartPhone smobj=new SmartPhone();
        smobj.Music();// ye superclass me nhi hai isiliye run nhi hoga
        // iske liye sub class ka object banana padega
    }
}
