package com.apnaCollege;
import java.util.*;
public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // outer loop
        for(int i=1;i<=n;i++){
            //no of spaces
            for(int sp=1;sp<=n-i;sp++){
                System.out.print("   ");
            }
            //no of stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();

        }
        for(int i=n;i>=1;i--){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
