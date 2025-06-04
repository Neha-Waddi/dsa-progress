package Dynamic_programming;

public class LongestCommonSusbseq {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[m][n];
    }
}

// recursion+memoization
// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int[][] dp=new int[text1.length()][text2.length()];
//         for(int[] row:dp) Arrays.fill(row,-1);
//         return lcs(text1.length()-1,text2.length()-1,text1,text2,dp);
//     }
//     public int lcs(int ind1,int ind2,String s1,String s2,int[][] dp){
//         if(ind1<0 || ind2<0) return 0;

//         if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];

//         if(s1.charAt(ind1)==s2.charAt(ind2)){
//         dp[ind1][ind2]=1+lcs(ind1-1,ind2-1,s1,s2,dp);
//         return dp[ind1][ind2];
//         }
        
//         dp[ind1][ind2]=Math.max(lcs(ind1-1,ind2,s1,s2,dp) , lcs(ind1,ind2-1,s1,s2,dp));
//         return dp[ind1][ind2];
//     }
// }