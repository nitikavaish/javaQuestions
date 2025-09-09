package com.practiceQuestions.main;
import java.util.*;

//public class Solution {
////    public static boolean isPalindrome(int x) {
////        int n=x;
////        int rev = 0;
//////        if(x<0){
//////            return false;
//////        }
////        while (x > 0) {
////            int ld = x % 10;
////            rev = rev * 10 + ld;
////            x = x / 10;
////        }
////        if (rev==n) {
////            return true;
////        } else {
////           return false;
////        }
//
//
//    }
//
//    public static void main(String[] args) {
//  Scanner sc=new Scanner(System.in);
////   int a=sc.nextInt();
////        System.out.println( isPalindrome(a));
////    }
//}
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m1=0,m2=0;
        float m=0;
        for(int i=0;i<nums1.length;i++){
            m1+=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            m2+=nums2[i];
        }
        m=(m1+m2)/2.0f ;
        return m;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int nums1[]=new int[n];
        int nums2[]=new int[m];


        for(int i=0;i<nums1.length;i++){
            nums1[i]=sc.nextInt();
        }
        for(int i=0;i<nums1.length;i++){
            nums2[i]=sc.nextInt();
        }
        System.out.println( findMedianSortedArrays(nums1,nums2));

    }
}