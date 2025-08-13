package com.apnaCollege;

import java.util.*;

public class largestElement {
    public static int maximumElement(int number[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
//            if (max < number[i]) {
//                max = number[i];
//            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        // return max;
        return min;
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        int arr[]={4,5,6,8,2,5,2};
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//        if(max<arr[i]){
//            max=arr[i];
//        }
//        }
//        System.out.println(" largest element in array is "+max);
        int number[] = {4, 5, 6, 8, 9, 0, 2, 6};
        //int largestele = maximumElement(number);
        int minEle = maximumElement(number);
        //  System.out.println(largestele);
        System.out.println(minEle);
    }
}