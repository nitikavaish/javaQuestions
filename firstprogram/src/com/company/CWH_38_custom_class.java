package com.company;
 class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println(" My ID is "+id);
        System.out.println(" and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
 }
public class CWH_38_custom_class {

    public static void main(String[] args) {
        System.out.println(" This is our custom calss ");
        Employee harry = new Employee();// Instantiating a new Employee Object
        Employee john = new Employee();
       // setting attributes
        harry.id=12;
        harry.name="codeWithHarry";
        harry.salary=17000;
        john.salary=12000;
        john.id=17;
        john.name="john khandelwal";
        //System.out.println(harry.id);
       // System.out.println(harry.name);
         harry.printDetails();
         john.printDetails();
         int salary=harry.getSalary();
        System.out.println(" salary of harry is "+salary);
        int Salary=john.getSalary();
        System.out.println(" salary of john is "+Salary);
    }
}

