package com.apnaCollege.Recursion;

public class arrayRecursion {
    public static void printElement(int arr[],int idx){
       if(idx==arr.length) return ;

       // self work
        System.out.print(arr[idx]+" ");
        // recursive work
        printElement(arr,idx+1);
    }
    public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6,7};
printElement(arr,0);
    }
}
