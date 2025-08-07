package graphs.BFS_DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pacificAtlantic {
    public List<List<Integer>> pacificatlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;

        int[][] pacific=new int[m][n];
        int[][] atlantic=new int[m][n];

        for(int j=0;j<n;j++){
            dfs(0,j,heights[0][j],pacific,heights);
            dfs(m-1,j,heights[m-1][j],atlantic,heights);
        }
        for(int i=0;i<m;i++){
            dfs(i,0,heights[i][0],pacific,heights);
            dfs(i,n-1,heights[i][n-1],atlantic,heights);
        }

        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j]==1 && atlantic[i][j]==1){
                    res.add(Arrays.asList(i,j));
                }
            }
        }

        return res;

    }
    public void dfs(int i,int j,int prev,int[][] vis,int[][] heights){
        int m=heights.length;
        int n=heights[0].length;

        if(i<0 ||j<0|| i>m-1||j>n-1 || vis[i][j]==1 || heights[i][j]<prev) return;

        vis[i][j]=1;

        dfs(i+1,j,heights[i][j],vis,heights);
        dfs(i-1,j,heights[i][j],vis,heights);
        dfs(i,j+1,heights[i][j],vis,heights);
        dfs(i,j-1,heights[i][j],vis,heights);

    }

}
