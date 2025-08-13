package com.apnaCollege;

public class Kadane_Method {
    public static void maxSubarraySum(int number[]) {

        // when all elements are negative in given array

//        int cs = 0;
//        int ms = Integer.MIN_VALUE;
//        System.out.print("current sum = ");
//        for (int i = 0; i < number.length; i++) { // when all numbers are negative
//            if (number[i] < 0) {
//                cs += number[i];
//                System.out.print(cs+" ");
//                ms = Math.max(cs, ms);
//            } else {
//            cs = cs + number[i];
//            if (cs < 0) {
//                cs = 0;
//            }
//            System.out.print(cs + " ");
//            ms = Math.max(cs, ms);
//
//            }
//        }
//        System.out.println(" \n max sum of subArray is " + ms);


        // WHEN AT LEAST ONE ELEMENT IS POSITIVE IN GIVEN ARRAY

        int cs = 0;
        int ms = Integer.MIN_VALUE;
        System.out.print("current sum = ");
        for (int i = 0; i < number.length; i++) { // when all numbers are negative
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            System.out.print(cs + " ");
            ms = Math.max(cs, ms);


        }
        System.out.println(" \n max sum of subArray is " + ms);


    }

    public static void main(String[] args) {
        //int number[] = {-1, -2, -3, -4};
         int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        maxSubarraySum(number);
    }
}
