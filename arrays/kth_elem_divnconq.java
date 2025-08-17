public class kth_elem_divnconq {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int m=a.length;
        int n=b.length;
        
        int count=0;
        
        int left=0;
        int right=0;
        
        while(left<m && right<n){
            if(a[left]<=b[right]){
                count++;
                if(count==k) return a[left];
                left++;
            }
            else{
                count++;
                if(count==k) return b[right];
                right++;
            }
        }
        
        while(left<m){
            count++;
            if(count==k) return a[left];
            left++;
        }
        
        while(right<n){
            count++;
            if(count==k) return b[right];
            right++;
        }
        
        return -1;
    }
}
