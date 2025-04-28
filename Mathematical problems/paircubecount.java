class Solution {
    static int pairCubeCount(int n) {
        // code here
        int count=0;
        for(int a=0;a*a*a<n;a++){
            int acube=a*a*a;
            int bcube=n-acube;
            
            if(bcube<0) continue;
            
            int b=(int)Math.round(Math.cbrt(bcube));
            if(b>=0 && b*b*b==bcube){
                count++;
            }
        }
        return count;
    }
};