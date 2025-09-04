package graphs;
import java.util.*;

//union-find
public class no_of_connectionsreq {
    class Solution {
    public int makeConnected(int n, int[][] connections) {
        int extra_edges=0;
        int components=0;

        int[] parent=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;

        int[] size=new int[n];
        Arrays.fill(size,1);

        for(int[] edge:connections){
            int pu=parent(edge[0],parent);
            int pv=parent(edge[1],parent);

            if(pu==pv) extra_edges++;
            else{
                union_size(pu,pv,parent,size);
            }

        }
        for(int i=0;i<n;i++){
                if(parent[i]==i) components++;
        }
            int need=components-1;
            if(extra_edges>=need) return need;
            return -1;
    }
    public int parent(int u,int[] parent){
        if(parent[u]==u) return u;
        return parent[u]=parent(parent[u],parent);
    }
    public void union_size(int u,int v,int[] parent,int[] size){
        int pu=parent[u];
        int pv=parent[v];

        if(pu==pv) return;
        if(size[pu]<size[pv]){
            parent[pu]=pv;
            size[pv]=size[pu]+size[pv];
        }
        else{
            parent[pv]=pu;
            size[pu]=size[pu]+size[pv];
        }
    }
}
}
