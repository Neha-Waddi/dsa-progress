import java.util.Arrays;

public class productExceptItself {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int prefix=1;
        int suffix=1;
        
        int n=arr.length;
        int[] res=new int[n];
        Arrays.fill(res,1);
        
        for(int i=0;i<n;i++){
            res[i]*=prefix;
            prefix=prefix*arr[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=suffix;
            suffix=suffix*arr[i];
        }
        
        return res;
    }
}
