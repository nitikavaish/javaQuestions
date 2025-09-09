package com.apnaCollege.sorting;

public class bubbleSort {
    public static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int swap=0;
            for (int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.println(" array is sorted ");
                break;
            }
        }
    }
    public static void main(String[] args) {
//        int arr[]={5,4,3,2,1};
        int arr[]={1,2,3,4,5,6};

        BubbleSort(arr);
        System.out.print("Sorted array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
