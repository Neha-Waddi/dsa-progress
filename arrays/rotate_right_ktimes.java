
public class rotate_right_ktimes {
     public void rotate(int[] nums, int k) {
        k = k % nums.length;

        //Right Rotation
        rotateArray(nums, 0, nums.length - 1); 
        rotateArray(nums, 0, k - 1); 
        rotateArray(nums, k, nums.length - 1); 
    }

    public static void rotateArray(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
