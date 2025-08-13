package com.apnaCollege;

public class trappingRainWater {
    public static int trapWater(int height[], int w) {// w=width
        // calculate left max boundary - in array form -> auxiliary array

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary - in array form
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        //  loop
        int TWL = 0;
        for (int i = 0; i < height.length; i++) {
            int WLH = Math.min(leftMax[i], rightMax[i]);// WLH=water level height
            TWL +=( WLH - height[i]) * w;
        }
        return TWL;

    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int w = 1;
        int trapWaterLevel = trapWater(height, w);
        System.out.println(" total trap water level is " + trapWaterLevel);

    }
}
