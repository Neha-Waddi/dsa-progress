

// Given two integers n and m. The problem is to find the number closest to n and divisible by m. If there is more than one such number, then output the one having the maximum absolute value.

// Examples :

// Input: n = 13 , m = 4
// Output: 12
// Explanation: 12 is the Closest Number to 13 which is divisible by 4.
// Input: n = -15 , m = 6
// Output: -18
// Explanation: -12 and -18 are both similarly close to -15 and divisible by 6. but -18 has the maximum absolute value. So, Output is -18


class Solution {
    static int closestNumber(int n, int m) {
        // code here
        int q=n/m;
        
        int num1=(q)*m;
        int num2=(q+1)*m;
        int num3=(q-1)*m;
        
        int res=num1;
        if(Math.abs(num2-n)<Math.abs(res-n) || Math.abs(num2-n)==Math.abs(res-n)){
            res=num2;
        }
        
        if(Math.abs(num3-n)<Math.abs(res-n) || Math.abs(num3-n)==Math.abs(res-n)){
            res=num3;
        }
        return res;
    }
};