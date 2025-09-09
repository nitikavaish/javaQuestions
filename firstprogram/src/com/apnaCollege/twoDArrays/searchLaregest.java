package com.apnaCollege.twoDArrays;

public class searchLaregest {
    public static int largestElement(int arr[][]){
        int max=Integer.MIN_VALUE;
        int i=0,j=0;
        for( i=0;i<arr.length;i++){
            for( j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("index of largest element is ("+i+","+j+")");
        return max ;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{1,3,2},{7,8,9}};
        int largest=largestElement(arr);
        System.out.println(" largest element is "+largest);
    }
}
