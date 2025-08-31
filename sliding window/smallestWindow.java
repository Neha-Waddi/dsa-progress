public class smallestWindow {
    public static String smallestWindow(String s, String p) {
        // code here
        int left=0;
        int small=Integer.MAX_VALUE;
        String ans="";
        
        int[] patt=new int[26];
        for(char c:p.toCharArray()){
            patt[c-'a']++;
        }
        int[] st=new int[26];
        int count=0;
        
        for(int right=0;right<s.length();right++){
            char cur=s.charAt(right);
            st[cur-'a']++;
            
            if(patt[cur-'a']>0 && st[cur-'a']<=patt[cur-'a']){
                count++;
            }
            if(count==p.length()){
                while(st[s.charAt(left)-'a'] > patt[s.charAt(left)-'a'] || patt[s.charAt(left)-'a']==0){
                    st[s.charAt(left)-'a']--;
                    left++;
                    
                }
            int len=right-left+1;
            if(len<small){
                small=len;
                ans=s.substring(left,right+1);
            }
            }
           
        }
        return ans;
    }
}
