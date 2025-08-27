package graphs;
import java.util.*;

import graphs.BFS_DFS.Pair;

class Pair{
    int dist;
    int node;
    Pair(int dist,int node){
        this.dist=dist;
        this.node=node;
    }
}
class Dijkstras {
    public int[] dijkstra(int V, int[][] edges, int src) {
        
        //adj list
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Pair>());
        }
        
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int d=edges[i][2];
            
            adj.get(u).add(new Pair(d,v));
        }
        // code here
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((a,b)->a.dist-b.dist);
        
        int[]dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[src]=0;
        pq.add(new Pair(0,src));
        
        while(pq.size()>0){
            Pair front=pq.poll();
            int d=front.dist;
            int node=front.node;
            for(int i=0;i<adj.get(node).size();i++){
                int w=adj.get(node).get(i).dist;
                int neighbor=adj.get(node).get(i).node;
                
                if(d+w<dist[neighbor]){
                    dist[neighbor]=d+w;
                    pq.add(new Pair(d+w,neighbor));
                }
            }
        }
        return dist;
    }
}