package Dynamic_programming;

import java.util.Arrays;

public class Coinchange {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int coin:coins){
            for(int j=coin;j<=amount;j++){
                if(dp[j-coin]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j-coin]+1,dp[j]);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
