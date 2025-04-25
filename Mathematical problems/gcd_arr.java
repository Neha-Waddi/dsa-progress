class Solution {
    public int gcd(int n, int arr[]) {
        // code here.
        return g_arr(arr);
    }
    public int g(int a,int b){
        if(b==0)
        return a;
        return g(b,a%b);
    }
    public int g_arr(int arr[]){
        int res=arr[0];
        
        for(int i:arr){
            res=g(res,i);
        }
        return res;
    }
}