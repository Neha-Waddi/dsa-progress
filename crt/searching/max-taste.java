package crt.searching;

//leetcode-2517

import java.util.*;

class Solution {
    public int maximumTastiness(int[] price, int k) {
        
        Arrays.sort(price);
        int low=0;
        int high=price[price.length-1]-price[0];
        int result=0;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(price,k,mid)){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;


    }
    public boolean check(int[] price,int k,int atleast){

        int before=price[0];
        int count=1;
        for(int p:price){
            if(p-before>=atleast){
                count++;
                if(count==k) return true;
                before=p;
            }
        }
        return false;

    }
}