package BinarySearch;

public class findH {
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        
        int low=0;
        int high=n-1;
        int res=0;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(find(citations,mid)){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public boolean find(int[] citations,int mid ){
        int count=0;
        for(int num:citations){
            if(num>=mid){
                count++;
            }
        }
        return count>=mid;
    }
}