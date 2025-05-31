package Dynamic_programming;

public class CountPartitionwithdiffK {
    int countPartitions(int[] arr, int d) {
        // code here
        int n=arr.length;
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=arr[i];
        }
        if((tot-d)<0 || (tot-d)%2!=0) return 0;
        int target=(tot-d)/2;
        int[][] dp=new int[n][target+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        if(arr[0]==0){
            dp[0][0]=2;
        }
        else{
            dp[0][0]=1;
            if(arr[0]<=target)
            dp[0][arr[0]]=1;
        }
        for(int i=1;i<n;i++){
            for(int t=0;t<=target;t++){
                int not=dp[i-1][t];
                int take=0;
                if(arr[i]<=t)
                take=dp[i-1][t-arr[i]];
                
                dp[i][t]=take+not;
            }
        }
        return dp[n-1][target];
    }}
