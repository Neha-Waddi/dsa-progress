 class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }

class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return max;
    }
    public int solve(TreeNode root){
        if(root==null) return 0;

        int left_sum=Math.max(0,solve(root.left));
        int right_sum=Math.max(0,solve(root.right));

        int curr_sum=left_sum+right_sum+root.val;
         max=Math.max(max,curr_sum);

        return root.val+Math.max(left_sum,right_sum);


    }
}