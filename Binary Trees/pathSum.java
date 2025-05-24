public class pathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0,targetSum);
    }
    public boolean helper(TreeNode root,int sum,int target){
        if(root==null) return false;

        if(root.left==null && root.right==null) {
            if(root.val+sum == target) return true;
            else return false;
        }
        return helper(root.left,sum+root.val,target) || helper(root.right,sum+root.val,target);
    }
}
