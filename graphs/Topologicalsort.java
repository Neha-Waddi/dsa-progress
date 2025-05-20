package graphs;

import java.util.*;
class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        int[] indegree=new int[V];
        for(int i=0;i<edges.length;i++){
            indegree[edges[i][1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
           int u=edges[i][0];
           int v=edges[i][1];
           adj.get(u).add(v);
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int a:adj.get(node)){
                indegree[a]--;
                if(indegree[a]==0)
                q.offer(a);
            }
        }
        return res;
        
    }
}