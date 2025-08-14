package com.practiceQuestions.main;

public class rotateArrayByKSteps {
    public static void reverse(int arr[], int si, int ei) {
        for (int i = si, j = ei; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int k = 3;
        // STEPS FOR ROTATING AN ARRAY BY k STEPS
        // k=k%n   (k>n)
        // REVERSE 0 TO n  ( n IS SIZE OF AN ARRAY )
        // REVERSE 0 TO k-1
        // REVERSE k TO n-1
        if (k > n) {
            k = k % n;
        }
        reverse(arr,0,n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        System.out.println(" rotated array by " + k + " steps");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
