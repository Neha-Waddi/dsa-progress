//best time to buy and sell stock

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max_profit=0;
        for(int price:prices){
            if(price<min){
                min=price;
            }
            if(price-min>max_profit){
                max_profit=price-min;
            }
        }
        return max_profit;
    }
}