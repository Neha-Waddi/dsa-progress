package Dynamic_programming;

import java.util.Arrays;

public class ncr {
    public int nCr(int n, int r) {
        // code here
        if(r>n) return 0;
        
        int[][] dp=new int[n+1][r+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        
        return find(n,r,dp);
    }
    public int find(int n,int r,int[][] dp){
        if(r==0 || r==n) return 1;
        
        if(dp[n][r]!=-1) return dp[n][r];
        
        return dp[n][r]=find(n-1,r,dp)+find(n-1,r-1,dp);
    }
}
