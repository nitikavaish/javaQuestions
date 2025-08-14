package com.practiceQuestions.main;

public class reverseArray {
    public static void revArray(int arr[], int si, int ei) {
        int n = arr.length;
        int i = si;
        int j = ei;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        // reverse a part of array from 1-4
        int si = 2;  // starting index
        int ei = 4;  // ending index
        revArray(arr, si, ei);
    }
}
