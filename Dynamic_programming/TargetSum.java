package Dynamic_programming;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int tot=0;
        for(int i:nums) tot+=i;

        if (tot < Math.abs(target) || (target + tot) % 2 != 0) return 0;

        int k=(target+tot)/2;
        int[][] dp=new int[nums.length][k+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        if(nums[0]==0){
            dp[0][0]=2;
        }
        else{
            if(nums[0]<=k){
                dp[0][nums[0]]=1;
            }
        }
        for(int i=1;i<n;i++){
            for(int s1=0;s1<=k;s1++){
                int not=dp[i-1][s1];
                int take=0;
                if(nums[i]<=s1)
                take=dp[i-1][s1-nums[i]];

                dp[i][s1]=take+not;
            }
        }
        return dp[n-1][k];
    }
}
