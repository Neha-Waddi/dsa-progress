package Dynamic_programming;

public class Min_delorins_tomakestringsame {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int common=lcsubstr(word1,word2);
        int del=m-common;
        int ins=n-common;

        return del+ins;
    }
    public int lcsubstr(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }
}
