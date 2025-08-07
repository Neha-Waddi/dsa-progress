package graphs.BFS_DFS;

public class maxAreaDFS {
    public int maxAreaOfIsland(int[][] grid) {
        int maxi=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                maxi=Math.max(maxi,dfs(i,j,grid));
            }
        }

        return maxi;
    }
    public int dfs(int i,int j,int[][] grid){
        if(i<0||j<0||i>grid.length-1||j>grid[0].length-1||grid[i][j]==0) return 0;

        grid[i][j]=0;//marking as visited

        return 1+dfs(i-1,j,grid)+dfs(i+1,j,grid)+dfs(i,j-1,grid)+dfs(i,j+1,grid);
    }
}
