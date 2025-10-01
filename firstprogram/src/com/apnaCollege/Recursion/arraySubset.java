package com.apnaCollege.Recursion;

import java.util.*;

public class arraySubset {
    public static void printSubsetSum(int a[], int idx, int sum, int n) {

        if (idx >= n) {
            System.out.print(sum + " ");
            return ;
        }

        // add curr index in curr sum
        printSubsetSum(a,  idx + 1,sum + a[idx], n);

        // don't add curr index in curr sum
        printSubsetSum(a,  idx + 1,sum, n);

    }

    public static void main(String[] args) {
        int arr[] = {2, 3};
        int n = arr.length ;
        printSubsetSum(arr, 0, 0, n);
    }
}
