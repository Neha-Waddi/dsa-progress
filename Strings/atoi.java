public class atoi {
    public int myAtoi(String s) {
        s=s.trim();
        long res=0;
        if(s.length()==0) return 0;

        int i=0;
        int sign=0;
        int n=s.length();

        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
        if(s.charAt(i)=='-') sign=1;
        i++;
        }
        
        while(i<n){
            int curr=s.charAt(i)-'0';
            if(curr>=0 && curr<=9){
                res=res*10+curr;
                if(sign==0 && res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(sign==1 && -res<Integer.MIN_VALUE) return Integer.MIN_VALUE;

                i++;
            }
            else
            break;
        }
        return sign==0?(int)res:(int)-res;
    }
}
