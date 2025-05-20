import java.util.*;
class Solution {
    public int clumsy(int n) {
        Stack<Integer> st=new Stack<>();
        st.push(n);
        n--;
        int res=0;
        int i=0;
        while(n>0){
            if(i==0){
                st.push(st.pop()*n);
            }
            else if(i==1){
                st.push(st.pop()/n);
            }
            else if(i==2){
                st.push(n);
            }
            else{
            st.push(-n);
            i=-1;
            }

            i++;
            n--;
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;

    }
}