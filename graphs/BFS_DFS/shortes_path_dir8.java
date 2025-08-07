package graphs.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

public class shortes_path_dir8 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0) return -1;

        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0,1});
        grid[0][0]=1;

        int[][] dir={
            {-1,-1},{-1,0},{-1,1},
            {0,-1},{0,1},
            {1,-1},{1,0},{1,1}
        };

        while(!q.isEmpty()){
            int[] front=q.poll();
            int i=front[0];
            int j=front[1];
            int dist=front[2];

            if(i==n-1 && j==n-1) return dist;

            for(int[] d:dir){
                int nr=i+d[0];
                int nc=j+d[1];

                if(nr>=0 && nr<=n-1 && nc>=0 && nc<=n-1 && grid[nr][nc]==0){
                    q.offer(new int[]{nr,nc,dist+1});
                    grid[nr][nc]=1;
                }
            }
        }
        return -1;
    }
}
