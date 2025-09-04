package graphs;

import java.util.Arrays;

public class union_rank_size {
    class Solution {
    public int spanningTree(int V, int[][] edges) {
      
        Arrays.sort(edges,(a,b)->Integer.compare(a[2],b[2]));
        int sum=0;
        
        int[] parent=new int[V];
        for(int i=0;i<V;i++) parent[i]=i;
        
        int[] rank=new int[V];
        int[] size=new int[V];
        Arrays.fill(size,1);
        
        for(int[] edge:edges){
            int pu=parent(edge[0],parent);
            int pv=parent(edge[1],parent);
            if(pu==pv) continue;//same component
            
            // union(pu,pv,parent,rank);
            union_size(pu,pv,parent,size);
            sum+=edge[2];
        }
        return sum;
        
    }
    public int parent(int node,int[] parent){
        if(parent[node]==node) return node;
        
        return parent[node]=parent(parent[node],parent);
    }
    public void union(int u,int v,int[] parent,int[] rank){
        int pu=parent(u,parent);
        int pv=parent(v,parent);
        
        if(pu==pv) return;
        
        if(rank[pu]<rank[pv]){
            parent[pu]=pv;
        }
        else if(rank[pv]<rank[pu]){
            parent[pv]=pu;
        }
        else{
            parent[pv]=pu;
            rank[pu]++;
        }
    } 
    public void union_size(int u,int v,int[] parent,int[] size){
        int pu=parent(u,parent);
        int pv=parent(v,parent);
        
        if(pu==pv) return;
        
        if(size[pu]<size[pv]){
            parent[pu]=pv;
            size[pv]=size[pu]+size[pv];
        }
        else {
            parent[pv]=pu;
            size[pu]=size[pu]+size[pv];
        }
    } 
}

}
