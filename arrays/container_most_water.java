public class container_most_water {
    public int maxWater(int arr[]) {
        // Code Here
        int start=0;
        int end=arr.length-1;
        
        int maxi=0;
        
        while(start<end){
            int min=Math.min(arr[start],arr[end]);
            int area=(end-start)*min;
            
            maxi=Math.max(maxi,area);
            
            while(start<end && arr[start]<=min) start++;
            while(start<end && arr[end]<=min) end--;
        }
        return maxi;
    }
}
