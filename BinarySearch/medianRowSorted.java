package BinarySearch;

public class medianRowSorted {
    public int median(int[][] mat) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        
        for(int i=0;i<m;i++){
            if(mat[i][0]<low)
            low=mat[i][0];
            
            if(mat[i][n-1]>high)
            high=mat[i][n-1];
            
        }
        
        int des=(m*n+1)/2;
       
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int pos=0;
            for(int i=0;i<m;i++){
                pos=pos+ub(mat[i],mid);
            }
            
            if(pos<des){
               
                low=mid+1;
            }
            else
            high=mid-1;
        }
        
        return low;
    }
    public int ub(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int res=arr.length;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                res=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return res;
    }
}
