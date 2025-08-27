package BinarySearch;

import java.util.Arrays;

public class countValidTr {
    public int countTriangles(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                int low=j+1;
                int high=n;
                int tg=arr[i]+arr[j];
                while(low<high){
                    int mid=low+(high-low)/2;
                    if(arr[mid]<tg){
                        low=mid+1;
                    }
                    else{
                        high=mid;
                    }
                }
                count+=low-j-1;
            }
        }
        return count;
    }
}
