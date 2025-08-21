package BinarySearch;

import java.util.Arrays;

public class maxMinDiff {
    public int maxminDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        
        int low=0;
        int high=arr[n-1]-arr[0];
        
        int res=0;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(find(arr,k,mid)){
                res=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        
        return res;
    }
    public boolean find(int[] arr,int k,int mid){
        int n=arr.length;
        
        int count=1;
        int last=arr[0];
        
        for(int i=0;i<n;i++){
            if(arr[i]-last>=mid)
            {
                count++;
                last=arr[i];
            }
            if(count==k) return true;
        }
        
        return false;
    }
}
