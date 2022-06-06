class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int i=0;i<prices.length;i++){
           low=Math.min(low,prices[i]);
            high=Math.max(high,prices[i]-low);
        }
        return high;
        
    }
}