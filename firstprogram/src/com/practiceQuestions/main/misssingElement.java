package com.practiceQuestions.main;

public class misssingElement {
    public static int findMissing(int arr[]) {
        int n = arr.length;
//        int totalSum = 0;
//        for (int i = 1; i <= 10; i++) {    // by loop
//            totalSum += i;
//        }
        int totalSum = 10 * (10 + 1) / 2;   // by formula

        System.out.print("total sum " + totalSum);
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            arraySum += arr[i];
        }
        System.out.print("\narray elements sum " + arraySum);
        int missEle = totalSum - arraySum;
        return missEle;
    }

    public static void main(String[] args) {
        // array contains 1 to 10 (N) elements find missing element
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(" \nmissing element is " + findMissing(arr));

    }
}
