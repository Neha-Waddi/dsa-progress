import java.util.Stack;

public class getMinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    
   

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        st.push(x);
        if(min.isEmpty() || x<=min.peek()){
            min.push(x);
        }
        else{
            min.push(min.peek());
        }
        
    }

    // Remove the top element from the Stack
    public void pop() {
        
        // code here
        if(!st.isEmpty())
        {
        st.pop();
        min.pop();
        }
    }

    // Returns top element of the Stack
        
    public int peek() {
        // code here
        if(!st.isEmpty()) return st.peek();
        return -1;
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if(!min.isEmpty())
        return min.peek();
        
        return -1;
    }
}
