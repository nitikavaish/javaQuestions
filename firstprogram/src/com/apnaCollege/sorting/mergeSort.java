package com.apnaCollege.sorting;

public class mergeSort {
    public static void mergeSortArray(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) left[i] = arr[l + i];
        for (j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < n1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < n2) {
            arr[k++] = right[j++];
//            k++;
//            j++;
        }
    }

    public static void sortHalfArray(int arr[], int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        sortHalfArray(arr, l, mid);
        sortHalfArray(arr, mid + 1, r);
        mergeSortArray(arr, l, mid, r);

    }


    public static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,9,8,3,2,6,7,4,6};
        int n = arr.length;
        System.out.println("Array before sorting");
        printArray(arr);
        sortHalfArray(arr, 0, n - 1);
        System.out.println();
        System.out.println("Array after sorting ");
        printArray(arr);


    }
}
