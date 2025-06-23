package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
     public List<String> generateParenthesiss(int n) {
        List<String> res=new ArrayList<>();
        generate(n,n,res,"");
        return res;
    }
    public void generate(int o,int c,List<String> res,String s){

        if(o==0 && c==0){
            res.add(s);
            return;
        }
        if(o>0){
            generate(o-1,c,res,s+"(");
        }
        if(c>0 && c> o){
            generate(o,c-1,res,s+")");
        }
    }
}
