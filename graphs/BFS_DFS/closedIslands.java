package graphs.BFS_DFS;

public class closedIslands {
     public int closedIsland(int[][] grid) {
         int m=grid.length;
         int n=grid[0].length;

         int[][] vis=new int[m][n];
         int count=0;

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && vis[i][j]==0 &&dfs(i,j,grid,vis)){
                    count++;
                }
            }
         } 
         return count;   
    }
    public boolean dfs(int i,int j,int[][] grid,int[][] vis){
        int m=grid.length;
        int n=grid[0].length;

        if(i<0 || j<0 || i>m-1 ||j>n-1) return false;

        if(grid[i][j]==1 || vis[i][j]==1) return true;

        vis[i][j]=1;
        boolean check=true;

        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};

        for(int k=0;k<4;k++) {
                int new_i=i+dx[k];
                int new_j=j+dy[k];
                if(!dfs(new_i,new_j,grid,vis))
                check=false;
        }
        return check;
    }
}
