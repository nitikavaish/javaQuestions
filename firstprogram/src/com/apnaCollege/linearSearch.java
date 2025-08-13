package com.apnaCollege;
import java.util.*;
public class linearSearch {
    public static int searchKey(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                break;
            }return i;
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number[]={4,7,5,9,1,10};
        System.out.print(" enter key : ");
        int key=sc.nextInt();
        int index=searchKey(number,key);
        if(index==-1){
            System.out.println(key+" not found");
        }else{
            System.out.println(key +" is at index : "+index);
        }



    }
}
