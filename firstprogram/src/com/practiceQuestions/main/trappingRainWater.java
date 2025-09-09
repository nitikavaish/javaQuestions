package com.practiceQuestions.main;

import java.util.*;

public class trappingRainWater {
    public static int trappedWater(int height[], int w) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];


        System.out.print("left max height auxillary array ");
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        for (int i = 0; i < leftMax.length; i++) {
            System.out.print(leftMax[i] + " ");
        }

        System.out.print("\nright max height auxillary array ");
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], leftMax[i + 1]);

        }
        for (int i = 0; i < rightMax.length; i++) {
            System.out.print(rightMax[i] + " ");
        }

        int TWL=0;
        for(int i=0;i<height.length;i++){
            int WLH= Math.min(leftMax[i],rightMax[i]);
            int WL=(WLH-height[i])*w;
           TWL+=WL;
        }
        return TWL;

    }

    public static void main(String[] args) {
        int height[] = {1, 5, 3, 4, 7, 2, 6, 6, 8};
        int w = 1;
        System.out.println("\nTotal trap water "+trappedWater(height, w));
    }
}
