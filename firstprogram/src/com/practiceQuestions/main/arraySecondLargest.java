package com.practiceQuestions.main;

public class arraySecondLargest {
    //    public static int secondLargestElement(int arr[]) {
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        int secMax = Integer.MIN_VALUE;     // THIS APPROACH ONLY FOR SORTED ARRAYS
//        for (int i = 0; i < n; i++) {
//            if (max < arr[i]) {
//                secMax = max;
//                max = arr[i];
//            }
//        }
//        return secMax;
//    }
    /*
    public static int secondLargestElement(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {                    // THIS IS APPLICABLE FOR ALL ARRAYS BUT THIS IS NOT OPTIMISE
            if (max < arr[i]) max = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (secMax < arr[i] && arr[i] != max) secMax = arr[i];
        }
        return secMax;

    }

     */
    public static int secondLargestElement(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                secMax = max;
                max = arr[i];
            } else if (secMax < arr[i] && max != arr[i]) {
                secMax = arr[i];
            }
        }
        return secMax;
    }


    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int arr[] = {9, 5, 6, 7, 4, 1, 2, 3, 8};
        int arr[]={1,2,3,4,4,2,1,0};


        System.out.println("second largest element is " + secondLargestElement(arr));
    }
}
