import java.util.Arrays;

public class substr_withall3char {
    public int numberOfSubstrings(String s) {
        int[] seen=new int[3];
        Arrays.fill(seen,-1);
        int count=0;
        
        for(int i=0;i<s.length();i++){
            seen[s.charAt(i)-'a']=i;
            if(seen[0]!=-1 && seen[1]!=-1 && seen[2]!=-1){
                count+=Math.min(seen[0],Math.min(seen[1],seen[2]))+1;
            }
        }
        return count;
    }
}
