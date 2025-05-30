public class CreateBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=bst(nums,0,nums.length-1);
        return root;
    }
    public TreeNode bst(int[] nums,int left,int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=bst(nums,left,mid-1);
        root.right=bst(nums,mid+1,right);
        return root;
    }
}
