package com.practiceQuestions.main;

public class doplicatElement {
    public static void duplicate(int arr[]) {
        int n = arr.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate element is " + arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 5, 6};
        duplicate(arr);

    }
}
