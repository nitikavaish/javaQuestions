package com.apnaCollege.sorting;

import java.util.*;
import java.lang.Float;
import java.util.ArrayList;

public class bucketSortAlgorithm {
    public static void bucketSort(float arr[]) {
        int n = arr.length;
        // buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        // create empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // add elements into our bucket
        for (int i = 0; i < n; i++) {
            int bucketIdx = (int) arr[i] * n;
            buckets[bucketIdx].add(arr[i]);
        }
        // sort each bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        // merge all buckets to get final sorted array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }

    }

    public static void printArray(float arr[]) {
        for (float a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        float arr[] = {0.42f, 0.32f, 0.25f, 0.52f, 0.23f, 0.47f, 0.51f, 0.92f, 0.68f, 0.75f};
        bucketSort(arr);
        printArray(arr);
    }
}
