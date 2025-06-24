import java.util.Arrays;

public class isomorphicCheck {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] s_arr=new int[256];
        int[] t_arr=new int[256];
        Arrays.fill(s_arr,-1);
        Arrays.fill(t_arr,-1);

        for(int i=0;i<s.length();i++){
            if(s_arr[s.charAt(i)]!=t_arr[t.charAt(i)])
            return false;

            s_arr[s.charAt(i)]=i;
            t_arr[t.charAt(i)]=i;
        }
        return true;
    }
}
