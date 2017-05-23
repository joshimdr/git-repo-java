package com.josh.code.general3;

/**
 * Created by Munish on 5/17/17.
 */
public class StockBuySell {

    public StockBuySell() {

    }


    public static void main(String[] args) {

        int[] price = new int[]{7, 1, 5, 3, 6, 4, 7, 2, 9};

        System.out.println(maxProfit(price));

    }

    public static StockDeal maxProfit(int[] prices) {
        if (prices.length == 0) {
            return null;
        }
        int max = 0;
        int sofarMin = prices[0];
        int sofarMinDay = 0;
        int sofarMaxDay = 0;

        for (int i = 0; i < prices.length; ++i) {
            if (prices[i] > sofarMin) {

                int currentDiff = prices[i] - sofarMin;
                // max = Math.max(max, prices[i] - sofarMin) ;

                if (currentDiff > max) {
                    max = currentDiff;
                }
                sofarMaxDay = i;

            } else {
                sofarMin = prices[i];
                sofarMinDay = i;
            }
        }

        return new StockDeal(max, sofarMinDay + 1, sofarMaxDay + 1);
    }
}
