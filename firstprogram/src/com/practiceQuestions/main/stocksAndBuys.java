package com.practiceQuestions.main;

public class stocksAndBuys {
    public static int  calculateProfit(int price[]){

        int bp=Integer.MAX_VALUE;
        int maxP=Integer.MIN_VALUE;
        for(int i=0;i<price.length;i++){
            int sp=price[i];
            if(sp>bp){
                int p=sp-bp;
               maxP= Math.max(p,maxP);
            }else{
                bp=sp;
            }
        }
        return maxP;
    }
    public static void main(String[] args) {
        int price []={7,1,5,3,6,4};
       int p=calculateProfit(price);
        System.out.println("maximum profit is "+p);

    }
}
