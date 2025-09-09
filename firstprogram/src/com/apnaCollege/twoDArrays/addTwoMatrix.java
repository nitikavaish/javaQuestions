package com.apnaCollege.twoDArrays;

public class addTwoMatrix {
    public static void add(int arr[][], int brr[][]) {
        int n=arr.length;
        int m=arr[0].length;
        int sum[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum[i][j] = arr[i][j] + brr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int brr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        add(arr, brr);
    }
}
