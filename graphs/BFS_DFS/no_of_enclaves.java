package graphs.BFS_DFS;

import java.util.*;


class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] vis=new int[m][n];
        Queue<Pair> q=new LinkedList<>();
        //first we add all the ones in border in queue they will be our sources to reach all other neighbours
        for(int i=0;i<m;i++){
            //first col
            if(grid[i][0]==1){
                vis[i][0]=1;
                q.offer(new Pair(i,0));
            }
            //last col
            if(grid[i][n-1]==1){
                vis[i][n-1]=1;
                q.offer(new Pair(i,n-1));
            }
        }
        for(int i=0;i<n;i++){
            //first row
            if(grid[0][i]==1){
                vis[0][i]=1;
                q.offer(new Pair(0,i));
            }
            //last row
            if(grid[m-1][i]==1){
                vis[m-1][i]=1;
                q.offer(new Pair(m-1,i));
            }
        }
        //visting neighbours of border ones 
        int[] drow={-1,0,1,0};
        int[] dcol={0,-1,0,1};
        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            q.poll();
            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    vis[nrow][ncol]=1;
                    q.offer(new Pair(nrow,ncol));
                }   
            }
        }

        //now we compare vis with grid
        //if grid have 1 and not visited that means it cannot be reached from borders so we count it as an enclave
            int count=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==1 && vis[i][j]==0)
                    count++;
                }
            }

        
            return count;

    }
}