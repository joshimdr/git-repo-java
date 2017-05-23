package com.josh.code.general3;

/**
 * Created by Munish on 5/17/17.
 */
public class StockDeal extends StockBuySell {


     int profit_amount = 0;

     int dayTobuy = 0;

     int dayToSell = 0;

    public StockDeal(int profit, int buy, int sell){

        this.profit_amount=profit;
        this.dayTobuy=buy;
        this.dayToSell=sell;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StockDeal{");
        sb.append("profit_amount=").append(profit_amount);
        sb.append(", dayTobuy=").append(dayTobuy);
        sb.append(", dayToSell=").append(dayToSell);
        sb.append('}');
        return sb.toString();
    }
}
