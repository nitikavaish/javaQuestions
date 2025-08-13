package com.company;

public class CWH_28_2Darray {
    public static void main(String[] args ){
        //={{101},{102},{103},{201},{202},{203}}
        int[][] flats = new int[2][3];// 2 rows 3 columns

      flats[0][0]=101;
       flats[0][1]=102;
       flats[0][2]=103;
       flats[1][0]=201;
      flats[1][1]=202;
      flats[1][2]=203;
        for(int i=0;i< 2;i++){
            for(int j=0;j<3;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
