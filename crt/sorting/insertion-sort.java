package crt.sorting;

class insertionSort {
    public static void insertionsort(int[] arr,int n){
        int j=0;
        for(int i=1;i<n;i++){
            int key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,2,5,9,5};
        insertionsort(arr,5);
    }
}
