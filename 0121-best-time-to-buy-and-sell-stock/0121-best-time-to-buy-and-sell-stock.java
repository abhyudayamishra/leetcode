class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
             int max=prices[i];
            int Newprofit = max-min;
            if(Newprofit>profit){
                profit=Newprofit;
            }
        }
        return profit;
        
    }
}