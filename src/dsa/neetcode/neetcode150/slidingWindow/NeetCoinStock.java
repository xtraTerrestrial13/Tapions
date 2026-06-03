package dsa.neetcode.neetcode150.slidingWindow;

import java.sql.SQLOutput;

public class NeetCoinStock {

public static void main(String[] args){
    NeetCoinStock neetCoinStock = new NeetCoinStock();
    int[] prices = {10,1,5,6,7,1};
    System.out.println(neetCoinStock.maxProfit(prices));
}


        public int maxProfit(int[] prices) {

            //negative then ignore - how about, i add the previous one.


            int maxP = 0;
            int minBuy = prices[0];

            for (int sell : prices) {
                maxP = Math.max(maxP, sell - minBuy);
                minBuy = Math.min(minBuy, sell);
            }
            System.out.println(maxP);


            int maxProfit =0;

            int l =0, r=prices.length-1;
            while(l<r){
                int profit = prices[r]-prices[l];

                if(profit>maxProfit){
                    maxProfit=profit;
                    r--;
                }else if(profit<0){
                    l++;
                }else{
                    l++;r--;
                }

            }

            System.out.println( maxProfit);


            for(int i=1 ; i<prices.length-1;i++){

                int profit = prices[i] - prices[i-1];
                if(profit>0){
                    prices[i-1] = prices[i-1]+profit;
                }else{
                    prices[i-1] = 0;
                }

                System.out.println(prices);

            }



            for(int i = 0;i<prices.length-1;i++){
                for(int j=i+1;j<prices.length;j++){
                    int profit = prices[j] - prices[i];
                    if(profit>maxProfit){
                        maxProfit=profit;
                    }
                }
            }
            return maxProfit;
        }


}
