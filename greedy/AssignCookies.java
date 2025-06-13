package greedy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int count=0;

        for(int c:s){
            if(i<g.length && c>=g[i]){
            count++;
            i++;
            }
        }
        return count;
    }
}
