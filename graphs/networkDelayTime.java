//dijkstras
package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class networkDelayTime {
    class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] t:times){
            int u=t[0];
            int v=t[1];
            int w=t[2];
            adj.get(u).add(new int[]{v,w});
        }

        int[] time=new int[n+1];
        Arrays.fill(time,Integer.MAX_VALUE);

        time[k]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});

        while(!pq.isEmpty()){
            int[] front=pq.poll();
            int node=front[0];
            int w=front[1];
            if (w > time[node]) continue;
            for(int[] a:adj.get(node)){
                int adj_w=a[1];
                int aj=a[0];
                if( w+adj_w<time[aj]){
                    time[aj]=w+adj_w;
                    pq.offer(new int[]{aj,w+adj_w});
                }
            }
        }
        int max=time[k];
        for(int i=1;i<=n;i++){
            if(time[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,time[i]);
        }
        return max;

    }
}
}
