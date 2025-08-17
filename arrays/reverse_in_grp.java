public class reverse_in_grp {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
        int i=0;
        
        while(i<n){
            int start=i;
            int end=start+k-1;
            rev(arr,start,end);
            i=i+k;
        }
        
        
    }
    public void rev(int[] arr,int start,int end){
        if(end>=arr.length){
            end=arr.length-1;
        }
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
        return ;
    }
}
