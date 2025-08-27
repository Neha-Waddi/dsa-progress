import java.util.Arrays;

public class countValidTr {
    public int countTriangles(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int count=0;
        
        for(int i=2;i<n;i++){
            int left=0;
            int right=i-1;
            while(left<right){
                if(arr[left]+arr[right]>arr[i]){
                    count+=(right-left);
                    right--;
                }
                else left++;
            }
        }
        return count;
    }
}
// we have binary search approach also
//go to binary search folder