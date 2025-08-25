import java.util.Comparator;
import java.util.PriorityQueue;

public class shortSubSumAtleastk {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        int min=n+1;

        long[] pre=new long[n+1];

        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }

        PriorityQueue<long[]> pq=new PriorityQueue<>(Comparator.comparingLong(a->a[0]));

        for(int j=0;j<=n;j++){
            while(!pq.isEmpty() && pre[j]-pq.peek()[0]>=k){
                long[] curr=pq.poll();
                min=Math.min(min,j-(int)curr[1]);
            }
            pq.offer(new long[]{pre[j],j});
        }

        return min==n+1?-1:min;
    }
}
