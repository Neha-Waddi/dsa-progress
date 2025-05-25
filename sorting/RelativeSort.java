package sorting;

public class RelativeSort {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=0;
        for(int i:arr1){
            max=Math.max(max,i);
        }
        int[] counts=new int[max+1];
        for(int i:arr1){
            counts[i]++;
        }
        int[] res=new int[arr1.length];
        int idx=0;
        for(int num:arr2){
            while(counts[num]>0){
                res[idx++]=num;
                counts[num]--;
            }
        }
        for(int i=0;i<=max;i++){
            while(counts[i]>0){
                res[idx++]=i;
                counts[i]--;
            }
        }
        return res;
    }
}
