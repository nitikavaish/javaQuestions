package com.practiceQuestions.main;

public class arrayPairs {
    public static int targetPairSum(int arr[], int t) {
        int sum = 0;
        int n = arr.length;
        int totalPairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == t) totalPairs++;
            }
        }
        return totalPairs;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 9, 3, 6, 8, 7, 2};
        int targetSum = 10;
        System.out.println(" no of total pairs whose sum is equal to target sum are " + targetPairSum(arr, targetSum));
    }
}
