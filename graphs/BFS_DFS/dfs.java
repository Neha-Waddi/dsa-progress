package graphs.BFS_DFS;

import java.util.*;
class dfs {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> Dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=adj.size();
        int[] visited=new int[n];
        solve(0,visited,adj,res);
        return res;
        
    }
    public void solve(int node,int[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        visited[node]=1;
        res.add(node);
        for(int a:adj.get(node)){
            if(visited[a]==0){
                solve(a,visited,adj,res);
            }
        }
    }
    
    
}