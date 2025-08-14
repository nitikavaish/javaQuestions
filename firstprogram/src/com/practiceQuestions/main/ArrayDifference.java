package com.practiceQuestions.main;

public class ArrayDifference {
    public static int difference(int arr[]) {
        int n = arr.length;
        int sumEven = 0;
        int sumOdd = 0;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        if (sumOdd > sumEven) {
            diff = sumOdd - sumEven;
        } else {
            diff = sumEven - sumOdd;
        }
        return diff;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 9, 6, 3, 2, 5, 8, 7};
        int d = difference(arr);
        System.out.println("difference is " + d);
    }
}
