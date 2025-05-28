import java.util.*;
public class Maximize_target {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int m=edges1.length+1;
        int n=edges2.length+1;
        List<Integer>[] adj1=adj(edges1,m);
        List<Integer>[] adj2=adj(edges2,n);
        int[] res=new int[m];
        int maxof2=0;
        if(k>0){
        for(int i=0;i<n;i++){
            maxof2=Math.max(maxof2,dfs(adj2,i,-1,k-1));
        }
        }
        for(int i=0;i<m;i++){
            res[i]=dfs(adj1,i,-1,k)+maxof2;
        }
        return res;

    }
    public List<Integer>[] adj(int[][] edges,int size){
        List<Integer>[] res=new ArrayList[size];
        for(int i=0;i<size;i++){
            res[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int a=edge[0];
            int b=edge[1];
            res[a].add(b);
            res[b].add(a);
        }
        return res;
    }
    public int dfs(List<Integer>[] adj,int node,int par,int k){
        if(k==0) return 1;
        int count=1;
        for(int neighbor:adj[node]){
            if(neighbor!=par){
                count+=dfs(adj,neighbor,node,k-1);
            }
        }
        return count;
    }
}
