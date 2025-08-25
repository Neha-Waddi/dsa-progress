import java.util.ArrayList;
import java.util.List;

public class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
       int m=mat.length;
       int n=mat[0].length;
       int[] ans=new int[m*n];
       int idx=0;

       int flag=0;
       for(int r=0;r<m;r++){
          int i=r;
          int j=0;
          if(flag==0){
            while(i>=0 && i<m && j>=0 && j<n){
                ans[idx++]=mat[i--][j++];
            }
            flag=1;
          }
          else{
            List<Integer> temp=new ArrayList<>();
            while(i>=0 && i<m && j>=0 && j<n){
                temp.add(mat[i--][j++]);
            }
            for(int k=temp.size()-1;k>=0;k--){
                ans[idx++]=temp.get(k);
            }
            flag=0;
          }
       }
          for(int c=1;c<n;c++){
            int i=m-1;
            int j=c;
            if(flag==0){
            while(i>=0 && i<m && j>=0 && j<n){
                ans[idx++]=mat[i--][j++];
            }
            flag=1;
            }
            else{
                List<Integer> temp=new ArrayList<>();
            while(i>=0 && i<m && j>=0 && j<n){
                temp.add(mat[i--][j++]);
            }
            for(int k=temp.size()-1;k>=0;k--){
                ans[idx++]=temp.get(k);
            }
            flag=0;
            }
          }
       return ans;
    }
}
