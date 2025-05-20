package sorting;

public class selection_sort {
    public static void sort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
     public static void main(String[] args) {
        int[] arr={5,2,5,9,5};
        sort(arr,5);
    }
}
