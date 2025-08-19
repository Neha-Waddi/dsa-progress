//w/o dp

public class longpalin {
    
    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int odd=ispossible(s,i,i);
            int even=ispossible(s,i,i+1);

            int len=Math.max(odd,even);
            if(len>end-start){
            start=i-(len-1)/2;
            end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int ispossible(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}

//other approach same logic 

class Solution {
    static String longestPalindrome(String s) {
        // code here
        int max=0;
        String res="";
        for(int i=0;i<s.length();i++){
            String p1=check(s,i,i);
            String p2=check(s,i,i+1);
            if(Math.max(p1.length(),p2.length())>max){
                if(p1.length()>p2.length())
                {
                    res=p1;
                    max=p1.length();
                }
                else{
                    res=p2;
                    max=p2.length();
                }
            }
        }
        return res;
    }
    static String check(String s,int i,int j){
        
        while(i>=0 && j<s.length() &&s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        
        return s.substring(i+1,j);
    }
}