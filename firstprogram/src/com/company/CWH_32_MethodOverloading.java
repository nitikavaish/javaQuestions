package com.company;

public class CWH_32_MethodOverloading {
    static void foo(){
        System.out.println(" Good Morning Bro!");
    }
    static void foo(int a){ // a nad b parameters hai
        System.out.println(" Good Morning "+ a +" Bro!");

    }
    static void foo(int a,int b){ // a nad b parameters hai
        System.out.println(" Good Morning "+ a +" Bro!");
        System.out.println(" Good Morning "+ b +" Bro!");

    }
    static void change(int a){
        a=98;
    }
    static void change2(int []arr){
        arr[0]=98;
    }
    static void tellJoke(){
        System.out.println(" I inventd a new world!\n"+"plagiarism!");
    }
    public static void main(String[] args){
        //tellJoke();
        // changing the integer
        // int x=45;
        // change(x);
       // System.out.println(" The value of x after running change function is "+x);
       // int[] marks={ 52,73,77,89,98,94};
        //change2(marks);// pass by reference --> add pass hota hai
       // System.out.println("The value of marks[0] after running CHANGE function  is "+marks[0]);


        // METHOD OVERLOADING
           foo();
           foo(3000);
           foo(3000,4000);// argument  = jo value ham pass karte hai = actual value

    }

}
// return typr karke overloading nhi kar sakte hai