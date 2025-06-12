import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> res=new ArrayList<Integer>();

        int firstrow=0;
        int firstcol=0;
        int lastrow=m-1;
        int lastcol=n-1;

        while(firstrow<=lastrow && firstcol<=lastcol){
            for(int j=firstcol;j<=lastcol;j++){
                res.add(matrix[firstrow][j]);
            }
            for(int i=firstrow+1;i<=lastrow;i++){
                res.add(matrix[i][lastcol]);
            }
            for(int j=lastcol-1;j>=firstcol;j--){
                if(firstrow!=lastrow){
                    res.add(matrix[lastrow][j]);
                }
                
            }
            for(int i=lastrow-1;i>=firstrow+1;i--){
                if(firstcol==lastcol) break;
                res.add(matrix[i][firstcol]);
            }
            firstrow++;
            firstcol++;
            lastrow--;
            lastcol--;
        }
        return res;

    }
}
