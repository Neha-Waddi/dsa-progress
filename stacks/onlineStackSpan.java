import java.util.Stack;

class Pair{
    int idx;
    int val;
    Pair(int idx,int val){
        this.idx=idx;
        this.val=val;
    }
}

public class onlineStackSpan {
    Stack<Pair> st;
    int idx;
    public void StockSpanner() {
        st=new Stack<>();
        idx=-1;
    }
    
    public int next(int price) {
        idx++;
        while(!st.isEmpty() && st.peek().val<=price){
            st.pop();
        }
        int res= st.isEmpty()?idx+1:idx-st.peek().idx;
        st.push(new Pair(idx,price));
        return res;
    }
}
