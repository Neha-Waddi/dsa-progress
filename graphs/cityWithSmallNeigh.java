//floyd-warshall
package graphs;

import java.util.Arrays;

public class cityWithSmallNeigh {
    public int findTheCity(int n, int[][] edges, int d) {
        int[][] mat=new int[n][n];
        
        for(int[] row:mat) Arrays.fill(row,Integer.MAX_VALUE);

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            mat[u][v]=w;
            mat[v][u]=w;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][k]!=Integer.MAX_VALUE && mat[k][j]!=Integer.MAX_VALUE){
                        if(mat[i][k]+mat[k][j]<mat[i][j])
                        mat[i][j]=mat[i][k]+mat[k][j];
                    }
                }
            }
        }

        int min=Integer.MAX_VALUE;
        int mini=-1;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j && mat[i][j]<=d) count++;
            }
            if(count<=min){
                min=count;
                mini=i;
            }
        }
        return mini;
    }
}
