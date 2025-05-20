package graphs;

import java.util.*;
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> adj=new ArrayList<>();
        //converting 2d matx to adjlist for easy dfs

        //initialize
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        //to count no of components
        int count=0;
        int[] vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,vis,adj);
                count++;
            }
        }

        return count;
    }
    public void dfs(int node,int[] vis,List<List<Integer>> adj){
        vis[node]=1;
        // here a is neighbor of node
        for(int a:adj.get(node)){
            if(vis[a]==0)
            dfs(a,vis,adj);
        }
    }
}