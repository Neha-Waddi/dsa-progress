package Dynamic_programming;

import java.util.Arrays;
import java.util.List;

public class wordBreak {
    public boolean wordbreak(String s, List<String> wordDict) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);

        return find(0,s,wordDict,dp)==1;
    }
    public int find(int i,String s,List<String> dict,int[] dp){
        int n=s.length();
        if(i==n) return 1;

        if(dp[i]!=-1) return dp[i];

        for(int j=i+1;j<=n;j++){
            String sub=s.substring(i,j);
            if(dict.contains(sub) && find(j,s,dict,dp)==1) return dp[i]=1;
        }
        return dp[i]=0;
    }
}
