package graphs;

import java.util.*;

class data{
    int row;
    int col;
    int time;
    data(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
public class Rotten_oranges {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;

        Queue<data> q=new LinkedList<>();
        int[][] vis=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new data(i,j,0));
                    vis[i][j]=2;
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        int count=0,time=0;

        while(!q.isEmpty()){
            data node=q.poll();
            int r=node.row;
            int c=node.col;
            int t=node.time;
            time=Math.max(t,time);

            for(int i=0;i<4;i++){
                int new_row=r+dx[i];
                int new_col=c+dy[i];

                if(new_row>=0 && new_row<m && new_col>=0 && new_col<n && 
                vis[new_row][new_col]==0 && grid[new_row][new_col]==1){
                    vis[new_row][new_col]=2;
                    q.offer(new data(new_row,new_col,t+1));
                    count++;
                }
            }

        }
        if(count!=fresh) return -1;
        return time;

    }
}