package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class stringPermutations {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        Set<String> res=new HashSet<>();
        generate(new StringBuilder(s),res,0);
        return new ArrayList<String>(res);
        
    }
    public void generate(StringBuilder s,Set<String> res,int idx ){
        if(idx==s.length()-1){
            res.add(s.toString());
            return ;
        }
        for(int i=idx;i<s.length();i++){
            swap(s,idx,i);
            generate(s,res,idx+1);
            swap(s,idx,i);
        }
        
    }
    public void swap(StringBuilder sb,int i,int j){
        char temp=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
    }
}
