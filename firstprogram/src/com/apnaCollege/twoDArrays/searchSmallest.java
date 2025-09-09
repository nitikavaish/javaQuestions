package com.apnaCollege.twoDArrays;

public class searchSmallest {
    public static int Smallest(int arr[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,0,6},{7,8,9}};
        System.out.println(" min element is "+Smallest(arr));
    }
}
