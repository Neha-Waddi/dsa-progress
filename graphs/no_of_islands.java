package graphs;

//dfs on grid ,, just grid everything is same as no of provinces
class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    dfs(grid,vis,i,j);
                    count++;
                }
            }
        }
        return count;

    }
    public void dfs(char[][] grid,int[][] vis,int i,int j){
        int m=grid.length;
        int n=grid[0].length;

        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0' || vis[i][j]==1)
        return ;

        vis[i][j]=1;

        dfs(grid,vis,i-1,j);
        dfs(grid,vis,i,j-1);
        dfs(grid,vis,i+1,j);
        dfs(grid,vis,i,j+1);

    }
}