package Dynamic_programming;

public class FrogJump {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int first=dp[i-1]+Math.abs(height[i]-height[i-1]);
            int second=Integer.MAX_VALUE;
            if(i>1){
                second=dp[i-2]+Math.abs(height[i-2]-height[i]);
            }
            dp[i]=Math.min(first,second);
        }
        return dp[n-1];
    }
}
