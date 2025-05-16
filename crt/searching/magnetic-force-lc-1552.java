package crt.searching;

import java.util.*;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1]-position[0];
        int result=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(position,m,mid)){
                 result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public boolean check(int[] position,int m,int distance){

        int before=position[0];
        int count=1;

        for(int p:position){
            if(p-before>=distance){
                count++;
                if(count==m) return true;
                before=p;
                
            }
        }
        return false;
    }
    
}