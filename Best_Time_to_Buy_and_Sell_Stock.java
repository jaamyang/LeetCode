public class Solution {
    public int maxProfit(int[] prices) {
        int []d = new int[prices.length];
        int maxprices=0;
        if(prices.length==0) return maxprices;
        d[0]=prices[0];
        for(int i = 1;i<prices.length;i++){
            d[i]=prices[i]>d[i-1]?d[i-1]:prices[i];
            maxprices=Math.max(maxprices,prices[i]-d[i]);
        }
        return maxprices;
    }
}