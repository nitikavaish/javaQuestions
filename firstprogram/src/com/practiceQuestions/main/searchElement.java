package com.practiceQuestions.main;

public class searchElement {
    public static int search(int arr[], int t) {
        int n = arr.length;
        boolean flag = false; // not present
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (t == arr[i]) {

                flag = true;
                idx = i;
                break;
            }

        }
        if (flag == true) {
            return idx;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 4, 8, 5, 1, 6};
        int t = 3;
        System.out.println(search(arr, t));
    }
}
