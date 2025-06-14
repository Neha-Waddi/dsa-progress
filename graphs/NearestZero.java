package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NearestZero {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] res=new int[m][n];
        int[][] vis=new int[m][n];

        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};

        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    vis[i][j]=1;
                }
            }
        }
        while(!q.isEmpty()){
            int[] node=q.poll();
            int r=node[0];
            int c=node[1];

            for(int i=0;i<4;i++){
                int nrow=r+dx[i];
                int ncol=c+dy[i];

                if(nrow>=0 && nrow<m && 
                   ncol>=0 && ncol<n && vis[nrow][ncol]==0){
                    
                    res[nrow][ncol]=1+res[r][c];
                    vis[nrow][ncol]=1;
                    q.offer(new int[]{nrow,ncol});
                    
                }
            }
        }
        return res;

    }
}
