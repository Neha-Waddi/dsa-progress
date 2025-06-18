package graphs;
import java.util.*;

class Pair{
    int v;
    int w;
    Pair(int v,int w){
        this.v=v;
        this.w=w;
    }
}
public class ShortestPathDAG {

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        Stack<Integer> st=new Stack<>();
        
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<E;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];
            adj.get(u).add(new Pair(v,w));
        }
        int[] vis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                topo(i,st,adj,vis);
            }
        }
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[0]=0;
        while(!st.isEmpty()){
            int node=st.pop();
            for(int i=0;i<adj.get(node).size();i++){
                int v=adj.get(node).get(i).v;
                int w=adj.get(node).get(i).w;
                if (dist[node] != Integer.MAX_VALUE && dist[node] + w < dist[v]) {
    dist[v] = dist[node] + w;
}

            }
        }
        for(int i=0;i<V;i++){
            if(dist[i]==Integer.MAX_VALUE){
                dist[i]=-1;
            }
        }
        return dist;
        
    }
    public void topo(int node,Stack<Integer> st,List<List<Pair>> adj,int[] vis){
        vis[node]=1;
        
        for(int i=0;i<adj.get(node).size();i++){
            int v=adj.get(node).get(i).v;
            if(vis[v]==0){
                topo(v,st,adj,vis);
            }
        }
        st.push(node);
    }
}