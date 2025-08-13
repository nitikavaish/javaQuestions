package com.apnaCollege;

import java.util.*;

public class reverseArray {
    public static void swapNumber(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {1, 5, 7, 9, 15, 58, 76, 95};
        swapNumber(number);
        System.out.println("Reverse Array");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }

    }
}
