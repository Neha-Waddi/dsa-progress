package sorting;

// Merge sort in Java

class MergeSort {

  // Merge two subarrays L and M into arr
  void merge(int arr[], int[] left,int left_size, int[] right, int right_size) {

   int i=0,j=0,k=0;
    
    while (i < left_size && j < right_size) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }

    while (i < left_size) {
      arr[k++] = left[i++];
    }

    while (j < right_size) {
      arr[k++] = right[j++];
    }
  }

  void mergeSort(int arr[], int n) {
    if (n>1) {
      int m =n/ 2;
      int[] left = new int[m];
      int[] right = new int[n-m];
      for (int i = 0; i<m;i++){
        left[i]=arr[i];
      }
      for (int i = 0; i<n-m;i++){
        right[i]=arr[i+m];
      }

      mergeSort(left,m);
      mergeSort(right,n-m);
      merge(arr, left,m,right,n-m);
    }
  }

  

}
