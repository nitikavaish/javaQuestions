package com.apnaCollege;
import java.util.*;
public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){

                int sum=i+j;
                System.out.print(sum+" ");

        }
            System.out.println();
        }
    }
}
