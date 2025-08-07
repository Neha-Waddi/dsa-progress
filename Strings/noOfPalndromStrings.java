public class noOfPalndromStrings {
     public int countSubstrings(String s) {
        int tot=0;
        for(int i=0;i<=s.length()-1;i++){
            int odd=find(s,i,i);
            int even=find(s,i,i+1);
            tot+=odd+even;
        }
        return tot;
    }
    public int find(String s, int left,int right){
        int count=0;
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }
}
