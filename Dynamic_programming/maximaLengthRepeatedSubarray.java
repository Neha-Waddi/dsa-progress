package Dynamic_programming;

import java.util.Arrays;

public class maximaLengthRepeatedSubarray {
    int max=0;
    public int findLength(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int[][] dp=new int[m][n];
        for(int[] row:dp) Arrays.fill(row,-1);

        find(m-1,n-1,nums1,nums2,dp);
        return max;

    }
    public int find(int i,int j,int[] a,int[] b,int[][] dp){
        if(i<0 || j< 0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        int ans=0;
        if(a[i]==b[j]) ans= 1+find(i-1,j-1,a,b,dp);
        find(i-1,j,a,b,dp);
        find(i,j-1,a,b,dp);
        
        max=Math.max(max,ans);
        return dp[i][j]=ans;
    }
}
