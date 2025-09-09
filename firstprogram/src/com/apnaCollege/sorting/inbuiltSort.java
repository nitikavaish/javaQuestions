package com.apnaCollege.sorting;

import java.util.*;

public class inbuiltSort {
    public static void main(String[] args) {
        Integer arr[] = {5,3,1,4,2};
       // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
