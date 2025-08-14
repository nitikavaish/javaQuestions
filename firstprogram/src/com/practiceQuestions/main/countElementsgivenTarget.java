package com.practiceQuestions.main;

public class countElementsgivenTarget {// count greater element given target

    public static int countElement(int arr[], int t) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > t) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 6, 5, 9, 7, 46};
        int t = 5;
        System.out.println(" no of greater elements to given target are " + countElement(arr, t));
    }
}
