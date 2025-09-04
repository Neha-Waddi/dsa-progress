package graphs;

import java.util.Arrays;
import java.util.HashSet;

public class most_stones_removed {
    public int removeStones(int[][] stones) {
        int n=stones.length;
        int comp=0;

        int max_row=0,max_col=0;
        for(int[] s:stones){
            max_row=Math.max(max_row,s[0]);
            max_col=Math.max(max_col,s[1]);
        }
        int[] parent=new int[max_row+max_col+2];
        for(int i=0;i<max_row+max_col+2;i++) parent[i]=i;

        int[] size=new int[max_row+max_col+2];
        Arrays.fill(size,1);

        HashSet<Integer> active=new HashSet<>();
        for(int i=0;i<n;i++){
            int row=stones[i][0];
            int col=stones[i][1]+1+max_row;
            active.add(row);
            active.add(col);

            union_size(row,col,parent,size);
        }
        for(int node:active){
            if(parent(node,parent)==node) comp++;
        }
        return n-comp;

    }
    public int parent(int u,int[] parent){
        if(parent[u]==u) return u;
        return parent[u]=parent(parent[u],parent);
    }
    public void union_size(int u,int v,int[] parent,int[] size){
        int pu=parent(u,parent);
        int pv=parent(v,parent);


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
