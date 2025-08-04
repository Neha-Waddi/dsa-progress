import java.util.Arrays;

public class closest3sum {
    static int closest3Sum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int res=arr[0]+arr[1]+arr[2];
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int curr=arr[i]+arr[j]+arr[k];
                if(Math.abs(curr-target)<Math.abs(target-res)){
                    res=curr;
                }
                else if(Math.abs(curr-target)==Math.abs(target-res)){
                    res=Math.max(res,curr);
                }
                if(curr==target) return curr;
                else if(curr<target){
                    j++;
                }
                else{
                    k--;
                }
                
            }
        }
        return res;
    }
    
}
