package com.apnaCollege;

public class maxSubArraySum {
    public static void maxSum(int number[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];// prefix sum approach
        prefix[0] = number[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }


        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];// ternary operator

//                for(int k=i;k<=j;k++){
//                    currSum+=number[k];
//                }
                System.out.println(currSum);
                if (maxsum < currSum) {
                    maxsum = currSum;
                }
                currSum = 0;
            }
        }
        System.out.println("max sum is " + maxsum);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        maxSum(number);
    }
}
