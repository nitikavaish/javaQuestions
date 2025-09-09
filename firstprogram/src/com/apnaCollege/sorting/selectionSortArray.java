package com.apnaCollege.sorting;

public class selectionSortArray {
    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                   minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }
    }
    public static void printArr(int arr[]){
        int n=arr.length;
        System.out.println("Sorted Array ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
         int arr[]={5,4,3,2,1};
         SelectionSort(arr);
         printArr(arr);
    }
}
