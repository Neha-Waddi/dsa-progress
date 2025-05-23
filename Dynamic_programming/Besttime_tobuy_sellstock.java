package Dynamic_programming;

public class Besttime_tobuy_sellstock {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int[] dp=new int[n];
       if(n==0) return 0;

       int min_price=prices[0];
       for(int i=1;i<n;i++){
        dp[i]=Math.max(dp[i-1],prices[i]-min_price);
        min_price=Math.min(min_price,prices[i]);
       }
       return dp[n-1];
    }
}
