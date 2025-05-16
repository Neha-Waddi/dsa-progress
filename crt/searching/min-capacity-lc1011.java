package crt.searching;

 class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int w:weights){
            max=Math.max(max,w);
            sum+=w;
        }
        int low=max;
        int high=sum;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(weights,days,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;




    }
    public boolean check(int[] weights,int days,int capacity){
        int need=1;
        int load=0;
        for(int w:weights){
            load=load+w;
            if(load>capacity){
                need++;
                load=w;
            }

        }
        return need<=days;
    }
} 