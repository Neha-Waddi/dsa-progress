package graphs.topological_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class courseschedule_dfs {
    public static ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] p:prerequisites){
            int u=p[0];
            int v=p[1];
            adj.get(v).add(u);
        }
        
        int[] vis=new int[n];
        for(int i=0;i<n;i++){
            if(dfs(i,adj,vis,res))
            return new ArrayList<>();
        }
        Collections.reverse(res);
        return res;
    }
    public static boolean dfs(int node,List<List<Integer>> adj,int[] vis,ArrayList<Integer> res){
        if(vis[node]==1) return true;
        
        if(vis[node]==2) return false;
        
        vis[node]=1;
        
        for(int a:adj.get(node)){
            if(dfs(a,adj,vis,res))
            return false;
        }
        
        vis[node]=2;
        res.add(node);
        
        return false;
    } 
}
