class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gc=gcd(a,b);
        int lcm=(a*b)/gcd(a,b);
        return new int[]{lcm,gc};
    }
    public static int gcd(int a, int b) {
    if (b == 0)
        return a;       
    else
        return gcd(b, a % b); 
}
}