import java.util.ArrayList;
import java.util.Arrays;

public class fourSum {
   public ArrayList<ArrayList<Integer>> foursum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        
        int n=arr.length;
        
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                int k=j+1;
                int l=n-1;
                
                while(k<l){
                    int curr=arr[i]+arr[j]+arr[k]+arr[l];
                    if(curr==target){
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        
                        res.add(temp);
                        
                        k++;
                        l--;
                        while(k<l &&arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                    else if(curr<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return res;
    }
}
