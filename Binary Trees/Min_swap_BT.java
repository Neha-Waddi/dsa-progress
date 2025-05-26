import java.util.*;
public class Min_swap_BT {
public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int swaps=0;
        while(!q.isEmpty()){
            int n=q.size();
            int[] arr=new int[n];
            int idx=0;
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                arr[idx++]=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            for(int i=0;i<n;i++){
                int min_ind=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[min_ind]){
                        min_ind=j;
                    }
                }
                if(i!=min_ind){
                swap(arr,min_ind,i);
                swaps++;
                }
            }
        }
        return swaps;
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
