package graphs.BFS_DFS;

public class islandCount {
    public int countIslands(char[][] grid) {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        
        int[][] vis=new int[m][n];
        int count=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]=='L'){
                    dfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
        
    }
    public void dfs(int i,int j,char[][] grid,int[][] vis){
        
        int m=grid.length;
        int n=grid[0].length;
        
         if(i<0 || j<0 || i>m-1 || j>n-1 || grid[i][j]!='L' || vis[i][j]==1) return ;
         
         vis[i][j]=1;
         
         int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
         int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int d = 0; d < 8; d++) {
                dfs(i + dx[d], j + dy[d], grid, vis);
        }

    }
}
