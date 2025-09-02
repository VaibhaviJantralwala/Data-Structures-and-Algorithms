class Solution {
    //O(n)
    public int maxProfit(int[] prices) {
        //return BuySellStockBruteForce(prices);

        int buyPrice = prices[0];
        int maxProfit = 0;
        for(int i=0 ; i<prices.length ; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    //O(n2)
    public int BuySellStockBruteForce(int[] prices) {
        int maxProfit = 0;
        for(int i=0 ; i<prices.length ; i++){
            for(int j=i+1 ; j<prices.length ; j++){
                int profit = prices[j] - prices[i]; 
                if( profit > maxProfit ){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
