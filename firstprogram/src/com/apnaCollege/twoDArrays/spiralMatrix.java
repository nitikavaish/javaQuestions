package com.apnaCollege.twoDArrays;

public class spiralMatrix {
    public static void printSpiral(int arr[][]) {

        int n = arr.length;
        int m = arr[0].length;
        int minRow = 0;
        int maxRow = n - 1;
        int maxCol = m - 1;
        int minCol = 0;
//        int tne = m * n;  // tne=total number of elements
//        int count = 0;
        while (minRow<=maxRow && minCol<=maxCol) {
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(arr[minRow][j] + " ");
                //count++;
            }
            minRow++;
//            if (count >= tne) {
//                break;
//            }
            for (int i = minRow; i <= maxRow; i++) {
                System.out.print(arr[i][maxCol] + " ");
                //count++;
            }
            maxCol--;
//            if (count >= tne) {
//                break;
//            }
            for (int j = maxCol; j >= minCol; j--) {
                System.out.print(arr[maxRow][j] + " ");
                //count++;
            }
            maxRow--;
//            if (count >= tne) {
//                break;
//            }
            for (int i = maxRow; i >= minRow; i--) {
                System.out.print(arr[i][minCol] + " ");
                //count++;
            }
            minCol++;
//            if (count >= tne) {
//                break;
//
//            }

        }
    }

    public static void main(String[] args) {
        //int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int arr[][]={{1,2,3,4,5},{5,6,7,8,9},{10,11,12,13,14},{16,17,18,19,20}};
        // 1  ,2 ,3 ,4 ,5
        // 5  ,6 ,7 ,8 ,9
        // 10,11,12,13,14
        // 16,17,18,19,20
        // 21,22,23,24,25
        printSpiral(arr);

    }
}
