package com.company;

public class CWH_27_arrays {
    public static void main(String[] args ){
        // float [] marks ={98.5f,45.5f,79.5f,99,80.5f};
        // String [] students = {"Harry"," Rohan", " Shubham", "Lovish" };
        // System.out.println(students.length);
        // System.out.println(students[2]);

        int [] marks ={98,45,79,99,80};
        int size=marks.length;
        //System.out.println(size);
           // displaying the array (Naive way)
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
           //Display using for loop
         //for(int i=0; i<size;i++){
         //System.out.print( marks[i] );
         //System.out.print(" ");
            // quick quiz --> Displaying array in reverse order
//            for(int i=size-1; i>=0;i--){
//                System.out.print( marks[i] );
//                System.out.print(" ");
//            }
        System.out.println(" Printing the Array by using For-Each Loop");
        for(int element:marks){
            System.out.print(element);
            System.out.print("  ");
        }

    }
}
