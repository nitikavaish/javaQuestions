package com.company;
import java.util.Scanner;
public class CWH_CH6_PS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PROBLEM 1
        /*
        float[] arr={4.5f,4,6.7f,9.0f,5};
        int size=arr.length;
        float sum=0;
        for(float element:arr){
            sum=sum+element;
        }
        System.out.println(" sum ");
        System.out.println(sum);
            */
        // PROBLEM 2
/*
        int[] arr = {4, 5, 9, 8, 7, 2, 3, 4, 55, 11, 66,};
        int size = arr.length;
        System.out.print(" enter element you have to check in array : ");
        int n = sc.nextInt();
        boolean flag = false;// element not found
        for (int element:arr) {
            if (element == n) {
                flag = true;// element found
                break;
            }
        }
        if(flag==true){
            System.out.println(" element present in arry");
        }
        else{
            System.out.println(" element not found");

        }
*/
        // PROBLEM 3
          /*
        float[] arr={95.5f,65.5f,60.0f,45.5f,35.5f};
        int size=arr.length;
        float sum=0;
        float avgmarks;
        for(float element:arr){
            sum=sum+element;
        }
        System.out.print(" average marks : " +sum/size);
        */
        //System.out.println(avgmarks);

        // PROBLEM 4
/*
        int [][] arr={{1,2,3},{4,5,6}};
        //1 2 3
        //4 5 6

        int [][] brr={{7,8,9},{0,1,2}};
        //7 8 9
        //0 1 2
//        int sizer=arr.length;
//        int sizec= arr[0].length;
//        System.out.println(" row size");
//        System.out.println(sizer);
//        System.out.println(" column size");
//        System.out.println(sizec);
//        System.out.println(" print 1st matrix ");
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                System.out.print(arr[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        System.out.println(" print 2nd matrix");
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                System.out.print(brr[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        int[][]sum=new int[2][3]; // declaration
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum[i][j]=arr[i][j]+brr[i][j];
            }
        }
        System.out.println(" sum of matrices");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
*/
        // PROBLEM 5
         /*
        System.out.println(" first method ");
        int[] arr = {4, 5, 9, 8, 7, 2, 3, 4, 55, 11, 66,};
        int size = arr.length;
        int []rev=new int[11];
        //System.out.println(" size of array is "+size);
        //System.out.println(size);
        //int[]rev=new int[11];
        for(int i=0;i<size;i++){
            rev[i]=arr[size-1-i];
        }
        //System.out.println(" reverse of array ");
        for(int element:rev){
            System.out.print(element+" ");

        }
        // 2ND METHOD
        System.out.println("\n second method ");
        int[] Arr = {4, 5, 9, 8, 7, 2, 3, 4, 55, 11, 66,};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        //for(int i=0;i<n;i++)
        int i=0;
         while(i<=l-1-i){
            //swap Arr[i]= first index ti last index and Arr[l-1-i]=last index to first index
            int temp=Arr[i];
             Arr[i]=Arr[l-1-i];
            Arr[l-1-i]=temp;
            i++;
        }
         for(int element:Arr){
             System.out.print(element+" ");
         }
         */
        // PROBLEM 6
         /*
        int[] arr = {4, 5, 9, 8, 7, 2, 3, 4, 55, 11, 66,85};
        int size = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(" maximum element is "+max);
        */
        //System.out.println(max);

         // PROBLEM 7
          /*
        int[] arr = {4, -5, 9, 8, 7,-1, 2, 3, 4, -55, 11, 66,};
        int size = arr.length;
        int min=Integer.MAX_VALUE;
        for(int element:arr) {
            if (min>element) {
                min=element;
            }

        }
        System.out.print(" minimum element : ");
        System.out.println(min);
        */
        // PROBLEM 8
        int[] arr = {1,2,3,4,5,6};
       int size=arr.length;
       boolean isSorted=true;
       for(int i=0;i<size-1;i++){
           if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
           }
       }
       if(isSorted){
           System.out.println(" Array is sorted ");
       }
       else{
           System.out.println(" Array is not sorted ");
       }
    }

}
