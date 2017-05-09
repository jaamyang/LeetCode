public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int Profit = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                Profit += prices[i] - prices[i-1]; 
            }    
        }
        return Profit;
    }
}
//股票价格数组可以绘制出一副折线图。在折线图的每一个谷底买入，然后在随后的一个高峰卖出，这样可以使得利润最大化。