public class BuyAndSellProfit {
    public int maxProfit(int prices[]) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i]<minprice){
                minprice = prices[i];
            }else if(prices[i]-minprice>maxprofit){
                maxprofit = prices[i]-minprice;
            }
        }
        return maxprofit;
    }
}
