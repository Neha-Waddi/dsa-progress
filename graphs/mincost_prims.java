package graphs;

import java.util.PriorityQueue;

public class mincost_prims {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        boolean[] vis=new boolean[n];
        
        int count=0;
        int tot_cost=0;

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,0});

        while(count<n){
            int[] front=pq.poll();
            int cost=front[0];
            int node=front[1];

            if(vis[node]) continue;
            vis[node]=true;
            count++;
            tot_cost+=cost;

            for(int next=0;next<n;next++){
                if(!vis[next]){
                    int nextcost=Math.abs(points[node][0]-points[next][0])+
                    Math.abs(points[node][1]-points[next][1]);

                    pq.offer(new int[]{nextcost,next});
                }
            }

        }
        return tot_cost;

  
    }
}
