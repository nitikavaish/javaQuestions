package com.apnaCollege.Recursion;

public class arraySum {
    public static int printSum(int arr[],int idx){
        if(idx==arr.length-1) return arr[idx];
            return arr[idx]+printSum(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(printSum(arr,0));
    }
}
