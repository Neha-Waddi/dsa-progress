package Dynamic_programming;

import java.util.*;

public class perfect_squares {
     List<Integer> perfects=new ArrayList<>();
    public int numSquares(int n) {
        perfect(n);
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int num:perfects){
            for(int j=num;j<=n;j++){
                if(dp[j-num]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j-num]+1,dp[j]);
                }
            }
        }
        return dp[n];
    }
    public void perfect(int n){
        for(int i=1;i*i<=n;i++){
            perfects.add(i*i);
        }
    }

}
