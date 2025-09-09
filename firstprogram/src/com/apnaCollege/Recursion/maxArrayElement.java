package com.apnaCollege.Recursion;

public class maxArrayElement {
    public static int printMax(int arr[],int idx){
        // base case
        if(idx==arr.length-1) return arr[idx];

        // small problem --> idx+1, end of the array --> max --> recursive

        int smallAns=printMax(arr,idx+1);
       // self work final ans
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,17,8,9};
        System.out.println( printMax(arr,0));
    }
}
