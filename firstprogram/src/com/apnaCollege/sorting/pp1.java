package com.apnaCollege.sorting;

public class pp1 {

    public static void sortArray(int arr[]) {
//        if (arr.length <= 1) {
//            return;
//        }
        int x = -1;
        int y = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
        if (x >= 0 && y >= 0) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
//        int arr[] = {3, 8, 6, 7, 5, 9, 10};
        int arr[] = {3};

        sortArray(arr);
        printArray(arr);
    }
}
