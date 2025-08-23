import java.util.Stack;

public class removeKdig {
    public String removeKdigits(String s, int k) {
        // code here
        if(k==s.length()) return "0";
        Stack<Character> st=new Stack<>();
        
        
        for(int i=0;i<s.length();i++){
            while(!st.isEmpty() && st.peek()-'0' > s.charAt(i)-'0' && k>0){
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        StringBuilder res= sb.reverse();
        while(res.length()>0 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        
        return res.length()==0?"0":res.toString();
    }
}
