package com.apnaCollege.sorting;

public class pushZeroes {
    public static void pushZeroesToEnd(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {0, 5, 0, 3, 4, 2};
        pushZeroesToEnd(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
