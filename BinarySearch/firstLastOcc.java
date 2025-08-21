package BinarySearch;

import java.util.ArrayList;

public class firstLastOcc {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        
        int first=lb(arr,x);
        int last=ub(arr,x)-1;
        
        if(first==arr.length || arr[first]!=x){
            res.add(-1);
            res.add(-1);
            return res;
        }
        
        res.add(first);
        res.add(last);
        
        return res;
    }
    int lb(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int res=arr.length;
        
        while(low<=high){
            int mid=low+(high-low)/2;
           
            if(arr[mid]>=x){
                res=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return res;
    }
    int ub(int[] arr,int x){
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
