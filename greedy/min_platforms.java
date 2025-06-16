package greedy;

import java.util.Arrays;

public class min_platforms {
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0;
        int count=0;
        int max=0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                count++;
                max=Math.max(max,count);
                i++;
            }
            else{
                j++;
                count--;
            }
        }
        return max;
    }
}
