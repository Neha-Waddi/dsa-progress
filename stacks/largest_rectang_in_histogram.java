import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();

            st.push(i);
        }
        st.clear();

        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i] ){
                st.pop();
            }
            if(st.isEmpty()) pse[i]=0;
            else pse[i]=st.peek()+1;

            st.push(i);
        }

        int max=0;
        for(int i=0;i<n;i++){
            int curr=(nse[i]-pse[i])*heights[i];
            max=Math.max(max,curr);
        }
        return max;

    }
}