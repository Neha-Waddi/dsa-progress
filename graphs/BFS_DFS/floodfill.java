package graphs.BFS_DFS;

public class floodfill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       
        int prev=image[sr][sc];
        
        if(prev==color) return image;
        
        dfs(image,sr,sc,color,prev);
        return image;
    }
    public void dfs(int[][] image,int i,int j,int c,int prev){
        int m=image.length;
        int n=image[0].length;
        if(i<0 || i>=m || j<0 || j>=n || image[i][j]!=prev) return;

        image[i][j]=c;

        dfs(image,i-1,j,c,prev);
        dfs(image,i+1,j,c,prev);
        dfs(image,i,j-1,c,prev);
        dfs(image,i,j+1,c,prev);
    }
}
