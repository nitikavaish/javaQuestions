package com.apnaCollege.sorting;

public class radixSortAlgorithm {
    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void stableCountSort(int arr[], int place) {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10];
        // frequency array
        for (int i = 0; i < arr.length; i++) {
            int placeDig = (arr[i] / place) % 10;
            count[placeDig]++;
        }
        // make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];

        }
        // find the index of each element in the original array and put it in output array
        for (int i = n - 1; i >= 0; i--) {
            int placeDig = (arr[i] / place) % 10;

            int idx = count[placeDig] - 1;
            output[idx] = arr[i];
            count[placeDig]--;

        }
        // copy all elements of output to array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    public static void radixSort(int arr[]) {
        int max = findMax(arr); // get max element
        // apply counting sort to sort elements based on place value
        for (int place = 1; max / place > 0; place *= 10) {
            stableCountSort(arr, place);
        }
    }

    public static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {43, 453, 626, 894, 0, 3};
        radixSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
