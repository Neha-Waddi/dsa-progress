package crt.searching;


class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int p:piles){
            high=Math.max(high,p);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(piles,h,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean check(int[] piles,int h,int speed){
        int required=0;
        for(int p:piles){
            required+=Math.ceil((double)p/speed);
        }

        return required<=h;

    }
}