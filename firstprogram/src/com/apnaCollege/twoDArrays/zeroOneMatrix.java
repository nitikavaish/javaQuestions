package com.apnaCollege.twoDArrays;

public class zeroOneMatrix {
    public static int rowNumHavingMaxOne(int arr[][]) {
        int rowNum = 0;
        int crCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int prCount = crCount;
            crCount = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    crCount++;
                }

            }
            if (crCount > prCount) {
                rowNum = i;
            }

        }
        return rowNum;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 0, 1, 1}, {0, 1, 0, 1}, {1, 1, 1, 1}};
        int rowNum = rowNumHavingMaxOne(arr);
        System.out.println(" Row number having maximum 1's = " + rowNum);

    }
}
