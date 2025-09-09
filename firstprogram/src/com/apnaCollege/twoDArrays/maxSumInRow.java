package com.apnaCollege.twoDArrays;

public class maxSumInRow {
    public static int rowNumHasMaxSum(int arr[][]) {

        int crSum = 0;// crSum=current row sum
        int rowNum = 0;// prSum=previous row sum
        for (int i = 0; i < arr.length; i++) {
           int prSum=crSum;
            crSum=0;
            for (int j = 0; j < arr[0].length; j++) {
                crSum += arr[i][j];

            }

            System.out.println(i+"th row sum "+crSum);
            if (crSum > prSum) {
                rowNum = i;
            }


        }

        return rowNum;

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {7,8,9}, {1,1,1}};

        int rowNum = rowNumHasMaxSum(arr);
        System.out.println(" row number having max sum = " + rowNum);
    }
}
