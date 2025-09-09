package com.apnaCollege.twoDArrays;

public class stairSearchHW {
    public static boolean search(int matrix[][], int key) {
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int row = n;
        int col = 0;
        while (row >= 0 && col <= m) {
            if (key == matrix[row][col]) {
                System.out.println(" key is found and index of key is (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("key is not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int key =32;
        search(matrix,key);


    }


}
