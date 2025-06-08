package Dynamic_programming;

public class Besttime_tobuy_sellstock_cooldown {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n+2][2];

        dp[n][0]=dp[n][1]=0;

        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                int prof=0;
                if(buy==1){
                    prof=Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
                }
                else{
                    prof=Math.max(prices[i]+dp[i+2][1],dp[i+1][0]);
                }
                dp[i][buy]=prof;
            }
        }
        return dp[0][1];
    }
}
