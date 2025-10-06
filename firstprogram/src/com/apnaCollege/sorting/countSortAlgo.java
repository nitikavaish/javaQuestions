package com.apnaCollege.sorting;

public class countSortAlgo {
    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countSorting(int arr[]) {
        int max = findMax(arr);
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void stableCountSort(int arr[]) {
        int n = arr.length;
        int output[] = new int[n];
        int max = findMax(arr);
        int count[] = new int[max + 1];
        // frequency array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];

        }
        // find the index of each element in the original array and put it in output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;

        }
        // copy all elements of output to array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 5, 3, 1, 3, 9};
        printArray(arr);
        //countSorting(arr);
        stableCountSort(arr);
        System.out.println();
        System.out.println("After sorting");
        printArray(arr);

    }
}
