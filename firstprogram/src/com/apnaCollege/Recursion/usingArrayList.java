package com.apnaCollege.Recursion;

import java.util.ArrayList;

public class usingArrayList {
    public static ArrayList<Integer> allIndices(int arr[],int idx,int target){
        // base case
        if(idx>=arr.length) return new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        // self work
        if(arr[idx]==target){
            list.add(idx);
        }
       ArrayList<Integer>smallAns= allIndices(arr,idx+1,target);
       list.addAll(smallAns);
       return list;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,5};
        ArrayList<Integer>ans=allIndices(arr,0,2);
        System.out.println(ans);
    }
}
