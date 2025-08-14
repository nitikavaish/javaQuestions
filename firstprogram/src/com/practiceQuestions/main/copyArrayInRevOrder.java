package com.practiceQuestions.main;

public class copyArrayInRevOrder {
    public static void reverseArray(int arr[]) {
        int n = arr.length;
        int brr[] = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[n - i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print( brr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(arr);
    }
}
