package BinarySearch;

import java.util.Arrays;

public class heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int n=houses.length;
        int res=0;

        Arrays.sort(houses);
        Arrays.sort(heaters);

        for(int i=0;i<n;i++){
            int l=0;
            int r=heaters.length-1;
            int house=houses[i];
            int min_d=Integer.MAX_VALUE;

            while(l<=r){
                int mid=l+(r-l)/2;

                int h=heaters[mid];
                int diff=Math.abs(h-house);
                min_d=Math.min(min_d,diff);

                if(h<house){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            } 
            res=Math.max(res,min_d);
        }

        return res;
    }
}
