public class minAreaOnes {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int fr=m-1;
        int fc=n-1;

        int er=0;
        int ec=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(i<fr) fr=i;
                    if(j<fc) fc=j;
                    if(i>er) er=i;
                    if(j>ec) ec=j;
                }
            }
        }
        return (er-fr+1)*(ec-fc+1);
    }
}
