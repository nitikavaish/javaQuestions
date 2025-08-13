package com.company;
import java.util.Scanner;
public class CWH_CH7_PS {
    // PROOBLEM NO 1
    /*
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format(" %d x %d = %d\n",n,i,n*i);
        }
    }
 */
    // PROBLEM NO 2
    /*
    static void pattern(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
     */
    // PROBLEM NO 3
    /*
     static int  sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    */
    // PROBLEM NO 4
    /*
    static void RevTriangle(int n){
    for(int i=0;i<n;i++){
        for(int j=n;j>i;j--){
            System.out.print(" *");
        }
        System.out.println();
}
    }
    // PR0BLEM NO 5
     /*
    static int fibonacci(int n){
        if (n==1||n==2)return 1;
        else return fibonacci(n-2)+fibonacci(n-1);

    }
    */
    //PROBLEM NO 6
    /*
    static float arrayAvg(int... arr){
        float avgSum=0;
       int size= arr.length;
        for(int a:arr){
            avgSum+=a;
        }
        return avgSum/size;
    }
     */
    // PROBLEM 7
    /*
    static void pattern4Rec(int n){
        if (n > 0) {
            for(int i=n;i>0;i--){
                System.out.print("* ");
            }
            System.out.println();
            pattern4Rec(n-1);
        }
    }
    */

    // PROBLEM NO 8
    /*
    static void pattern1Rec(int n){
        if (n > 0) {
            pattern1Rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     */
    // PROBLEM NO 9
    /*
    static float changeFahrenheit(int c){
        return (c*9/5.0f+32.0f);
    }
     */

    public static void main(String[] args) {
        // PROBLEM 1
/*
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter number which multiplication table you have to need");
        int n=sc.nextInt();
        System.out.println("table of "+n);
      multiplication(n);

 */
        // problem no 2
        /*
        Scanner nc=new Scanner(System.in);
        System.out.println(" enter no of lines ");
        int a =nc.nextInt();
        pattern(a);
       */
        // PROBLEM 3
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter nth natural number ");
        int n=sc.nextInt();
        System.out.println(sum(n));
         */
        // PROBLEM NO 4
        /*
        Scanner nc=new Scanner(System.in);
        System.out.print(" enter no of lines ");
        int a =nc.nextInt();
        RevTriangle(a);
         */
        // PROBLEM NO 5
        /*
        Scanner nc=new Scanner(System.in);
        System.out.print(" enter nth term of fibonacci series  ");
        int a =nc.nextInt();
        System.out.println(fibonacci(4));
         */
        // PROOBLEM 6
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter size of an array\n");
        int n=sc.nextInt();
        System.out.println("enter array elements ");
      int[] arr= new int[n];
      for(int i=0;i<n;i++){
          arr[i]= sc.nextInt();
      }
      System.out.println(" average of no passed as an argument is "+arrayAvg(arr));

     */
        // PROBLEM NO 7
        /*
        System.out.print(" enter no of lines ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        pattern4Rec(n);
         */
        // PROBLEM no 8
        /*
        System.out.print(" enter no of lines ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        pattern1Rec(n);
        */
        // PROBLEM NO 9
        /*
        System.out.print(" enter temprature in celcious ");
        Scanner sc=new Scanner(System .in);
        int celcious =sc.nextInt();
        System.out.println("temprature in farenhite "+changeFahrenheit(celcious) );
*/
       // PR0BLEM NO 10
        /*
       Scanner sc=new Scanner(System.in);
        System.out.print(" enter nth number ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(" sum of natural numbers up to n numbers "+sum);
        */

    }
}
