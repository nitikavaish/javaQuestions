package com.practiceQuestions.main;

import com.sun.security.jgss.GSSUtil;

public class arrayTriplets {
    public static int countTriplets(int arr[], int t) {
        int n = arr.length;
        int totalTriplets = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == t) totalTriplets++;
                }
            }
        }
        return totalTriplets;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        System.out.println("Tootal no. of triplets are " + countTriplets(arr, target));
    }
}
