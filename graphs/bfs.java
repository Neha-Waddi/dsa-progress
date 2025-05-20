package graphs;

import java.util.*;

class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        q.offer(0);
        int n=adj.size();
        int[] vis=new int[n];
        vis[0]=1;
        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int a:adj.get(node)){
                if(vis[a]==0){
                    vis[a]=1;
                    q.offer(a);
                }
            }
        }
        return res;
    }
}
