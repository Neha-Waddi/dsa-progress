package sorting;

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        
        return sort(arr,arr.length);
        
        
    }
    public static int merge(int[] arr,int[] left,int left_size,int[] right,int right_size ){
        int i=0,j=0,k=0;
        int count=0;
        while(i<left_size && j<right_size){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
                count+=(left_size-i);
            }
        }
        while(i<left_size){
            arr[k++]=left[i++];
        }
        while(j<right_size){
            arr[k++]=right[j++];
        }
        return count;
    }
    public static int sort(int[] arr,int n){
        if(n>1){
            int mid=n/2;
            int[] left=new int[mid];
            int[] right=new int[n-mid];
            for(int i=0;i<mid;i++){
                left[i]=arr[i];
            }
            for(int i=0;i<n-mid;i++){
                right[i]=arr[mid+i];
            }
            int l=sort(left,mid);
            int r=sort(right,n-mid);
            int tot=merge(arr,left,mid,right,n-mid);
            return l+r+tot;
        }
        return 0;
    }
}