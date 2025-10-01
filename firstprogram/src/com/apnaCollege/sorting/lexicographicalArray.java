package com.apnaCollege.sorting;

public class lexicographicalArray {
    public static void lexicographicalOrder(String str[]) {
        int n = str.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (str[minIdx].compareTo(str[j]) > 0) {
                    minIdx = j;
                }
            }
            String temp = str[i];
            str[i] = str[minIdx];
            str[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        String str[] = {"kiwi", "apple", "papaya", "mango"};
        lexicographicalOrder(str);
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
