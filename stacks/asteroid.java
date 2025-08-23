import java.util.Stack;

public class asteroid {
    public static int[] asteroidCollision(int n, int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek() >0 &&st.peek()<Math.abs(arr[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(arr[i])) st.pop();
                
                else if(st.isEmpty() || st.peek()<0) st.push(arr[i]);
            }
        }
        
        int[] res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}
