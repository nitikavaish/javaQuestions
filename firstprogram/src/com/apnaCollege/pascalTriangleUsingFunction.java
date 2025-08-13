package com.apnaCollege;

import java.util.Scanner;

public class pascalTriangleUsingFunction {
    public static int calculateFactorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * calculateFactorial(x - 1);
        }
    }
    public static int combination(int n,int r) {
        int nCr = calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
        return nCr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                int iCj=combination(i,j);
                System.out.print(iCj+" ");
            }
            System.out.println();
        }
    }
}
