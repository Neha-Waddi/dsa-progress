package crt.searching;

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) return -1;

        int left=1;
        int right=0;
        for(int d:bloomDay){
            right=Math.max(right,d);
        }
        int result=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(check(bloomDay,m,k,mid)){
                result=mid;
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return result;



    }
    public boolean check(int[] bloomDay,int m,int k,int day){
        int b=0;
        int f=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                f++;
                if(f==k){
                    b++;
                    f=0;
                }
               
            }
             else{
                    f=0;
                }
        }
        return b>=m;
    }
}

// we are going to check for every day 1 to max if possible to make bouqets so inorder to check for every day we can apply binary search so that if mid no of days are possible to make m bouquets , 
//check if days less than that can be possible or else check for days possible in right half
//search space is fixed and we need to optimise