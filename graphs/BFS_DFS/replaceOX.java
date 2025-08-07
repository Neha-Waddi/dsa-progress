package graphs.BFS_DFS;

import java.util.*;


public class replaceOX {
    static char[][] fill(char mat[][]) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        
        Queue<int[]> q=new LinkedList<>();
        
        for(int i=0;i<m;i++){
            if(mat[i][0]=='O'){
                q.offer(new int[]{i,0});
            }
            if(mat[i][n-1]=='O'){
                q.offer(new int[]{i,n-1});
            }
        }
        
        for(int j=0;j<n;j++){
            if(mat[0][j]=='O') q.offer(new int[]{0,j});
            if(mat[m-1][j]=='O') q.offer(new int[]{m-1,j});
        }
        
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        
        while(!q.isEmpty()){
            int[] front=q.poll();
            int r=front[0];
            int c=front[1];
            
            if(r<0 || c <0||r>m-1||c>n-1||mat[r][c]!='O') continue;
            
            mat[r][c]='T';
            
            for(int k=0;k<4;k++){
                int nr=r+dx[k];
                int nc=c+dy[k];
                
                q.offer(new int[]{nr,nc});
                
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]=='O') mat[i][j]='X';
                else if(mat[i][j]=='T') mat[i][j]='O';
            }
        }
        return mat;
    }
}
