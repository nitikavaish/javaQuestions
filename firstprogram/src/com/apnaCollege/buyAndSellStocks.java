package com.apnaCollege;

public class buyAndSellStocks {
    public static int profit(int price[]) {
        int n = price.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;// today's profit
                maxProfit = Math.max(maxProfit, profit);// global profit
            } else {

                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        //int price[] = {7, 1, 5, 3, 6, 4};
        int price[]={8,7,6,5,4,3,2};
        int p = profit(price);
        System.out.println(" max profit is " + p);
    }
}
