class Solution {
    public int maxProfit(int[] prices) {
        int minsofar = prices[0];
        int maxProfit = 0;
        for(int i=1 ; i<prices.length ; ++i){
            if(minsofar > prices[j]) minsofar = prices[j];
            int profit = prices[j] - minsofar;
            if(maxProfit < profit) maxProfit = profit;
        }
        return maxProfit;
    }
}
