class Solution {
    public int maxProfit(int[] prices) {
        int i=0,j=1;
        int sum=0;
        while(j<prices.length){
           if(prices[i]<prices[j]){
                 int profit = prices[j] - prices[i];
                 sum = Math.max(sum, profit); }
           else{
                i=j;
           }
           j++;

        }
        return sum;
    }
}