package com.apnaCollege;
import java.util.*;
public class passingArrayAsArgument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks []={97,98,99};
        System.out.println("input marks");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        update(marks);
        System.out.println("output marks");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

    }
}
