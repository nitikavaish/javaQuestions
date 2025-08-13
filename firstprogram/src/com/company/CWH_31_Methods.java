package com.company;

public class CWH_31_Methods {
     static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args){
        int a=5;
        int b=7;
        int a1=2;
        int b1=1;
        // Method invocation using object creation
        // CWH_Methods obj=new CWH_Methods();
        // int c=obj.logic(a,b);
        // int c1=obj.logic(a1,b1);
        System.out.println("a=" +a+ " b=" +b);
        System.out.println( "a1="+a1+" b1="+b1);
        int c=logic(a,b); // pass by value isme sirm copy pass hoti hai main fun mr koi changes nhi honge
        int c1=logic(a1,b1);
        System.out.println(" value of c is "+c);
        System.out.println(" value of c1 is "+c1);

    }
}
