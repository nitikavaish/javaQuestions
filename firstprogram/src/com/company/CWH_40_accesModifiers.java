package com.company;
class myEmployee{
   private int id;
    private String name ;
    public void setName(String n){
        this.name= n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
       this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class CWH_40_accesModifiers {
    public static void main(String[] args) {
     myEmployee Harry =new myEmployee();
     //Harry.id=45;
        // Harry.name="codeWithHarry";--> throws error due to private accesifiers
        Harry.setName("codeWithHarry");
        System.out.println("set name is "+Harry.getName());
        Harry.setId(5);
        System.out.println(" set id is "+Harry.getId());


    }
}
