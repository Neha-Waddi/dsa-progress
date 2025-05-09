import java.util.*;
class Solution {
    public boolean isValid(String s) {

        if(s.length()%2!=0)
        return false;

        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i++);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                  char top=stack.pop();
                  if(c==')' && top!='(')
                  return false;
                  else if(c=='}' && top!='{')
                  return false;
                  else if(c==']' && top!='[')
                  return false;
            }
        }
            return stack.isEmpty();

    }
}