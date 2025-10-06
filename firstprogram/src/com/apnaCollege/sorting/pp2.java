package com.apnaCollege.sorting;

   public class pp2 {
//    public static void segregateArray(int arr[]) {
//        int x = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                if (i != x) {
//                    int temp = arr[i];
//                    arr[i] = arr[x];
//                    arr[x] = temp;
//                }
//                x++;
//            }
//        }
//   }


    // using quick sort algorithm

    public static void quickSortPartition(int arr[]) {
        int pi = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            while (arr[l] < 0) l++;
            while (arr[r] >= 0) r--;
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {19, -20, 7, -4, -13, 11, -5, 3};
        //segregateArray(arr);
       quickSortPartition(arr);
        printArray(arr);
    }
}