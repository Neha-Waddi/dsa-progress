package BinarySearch;

public class AllocateBooks {
    public static int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length) return -1;

        int low=-1;
        int high=0;
        for(int i:arr){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,k,mid)){
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return low;
    }
    public static boolean check(int[] arr,int k,int mid){
        int st=1;
        int pg=0;
        for(int i=0;i<arr.length;i++){
            if(pg+arr[i]<=mid){
                pg+=arr[i];
            }
            else{
            st++;
            pg=arr[i];    
            }
        }
        return st<=k;
    }
}
