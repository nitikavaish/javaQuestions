package com.apnaCollege.sorting;

public class quickSortAlgorithm {
    public static void quickSort(int arr[], int st, int end) {
        if (st >= end) return;
        int pidx = partition(arr, st, end);
        quickSort(arr, st, pidx - 1);
        quickSort(arr, pidx + 1, end);

    }

    public static int partition(int arr[], int st, int end) {
        int pi = arr[st];
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pi) cnt++;
        }
        int pidx = st + cnt;
        swap(arr, st, pidx);
        int i = st, j = end;
        while (i < pidx && j > pidx) {
            while (arr[i] <= pi) i++;
            while (arr[j] > pi) j--;

            if (i < pidx && j > pidx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pidx;

    }


    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 13, 8, 5, 10, 2, 4};
        int n = arr.length;
        System.out.println("Before sorting");
        printArray(arr);
        quickSort(arr, 0, n - 1);
        System.out.print("\nAfter sorting\n");
        printArray(arr);

    }
}
