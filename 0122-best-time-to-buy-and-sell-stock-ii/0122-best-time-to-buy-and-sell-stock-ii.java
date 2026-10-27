class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int max = 0;
        for(int i =1;i<prices.length;i++){
            int profit =0;
            if(prices[i]< prices[i-1]){
                sell = prices[i-1];
                profit = sell - buy;
                buy = prices[i];
            }
            if(prices[i]>buy && i == prices.length-1){
                sell = prices[i];
                profit = sell - buy;
            }
            max = max + profit;
        }
        return max;
    }
}