import java.util.Stack;

public class sumSubarrMins {
    public int sumSubMins(int[] arr) {
        // code here
        int n=arr.length;
        int[] pse=new int[n];
        int[] nse=new int[n];
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        int tot=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            
            tot+=(left*right*arr[i]);
        }
        return tot;
    }
}
