package com.company;
import java.util.Scanner;
class myMainEmployee{

    private int id;// method overloading --> same name ke many methods passing different parameter
    private String name ;
    private int salary;
   public myMainEmployee(){ // automatic invoke --> constructor
//    ( jis name ki class ho agar usi name ka method bana do to use java constructor kahte hai )
      id = 45;
     name = " Your_Name_Here";
      salary=10000;
   }
   public myMainEmployee( String myName,int myid){ // automatic invoke --> constructor
         id = myid;
         name = myName;

   }
    public myMainEmployee( String myName,int myid,int mysalary){ // automatic invoke --> constructor
        id = myid;
        name = myName;
        salary=mysalary;

    }

   // public void setName(String n) {this.name= n;}
   public String getName() {return name;}
   // public void setId(int i) {this.id=i;}
    public int getId() {return id;}
    //public void setSalary(int n) {this.salary=n;}
    public int getSalary() {return salary;}

}
 public class CWH_42_constructors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        myMainEmployee Harry= new myMainEmployee("programmingWithHarry", n=sc.nextInt(),10000);
        // Harry.setName(" codeWithHarry ");
       // Harry.setId(34);
        System.out.println(Harry.getName());
        System.out.println(Harry.getId());
        System.out.println(Harry.getSalary());
    }
 }
