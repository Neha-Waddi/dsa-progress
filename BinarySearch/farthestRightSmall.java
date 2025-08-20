package BinarySearch;

import java.util.*;

public class farthestRightSmall {
    class Solution {
    public ArrayList<Integer> farMin(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        

        int[] suffMin = new int[n];
        suffMin[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            suffMin[i] = Math.min(arr[i], suffMin[i+1]);
        }
        
        
        for(int i = 0; i < n; i++) {
            int ans = -1;
            int l = i+1, r = n-1;
            
            while(l <= r) {
                int mid = l + (r-l)/2;
                
                if(suffMin[mid] < arr[i]) {
                    ans = mid;   
                    l = mid + 1; 
                } else {
                    r = mid - 1; 
                }
            }
            
            res.add(ans);
        }
        return res;
    }
}

}
