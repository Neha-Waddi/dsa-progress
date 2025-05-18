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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {

       solve(root);
        return max;
        
    }
    public int solve(TreeNode root){
        if(root==null) return 0;

        int left_height=solve(root.left);
        int right_height=solve(root.right);

        int curr=left_height+right_height;
        max=Math.max(curr,max);

        return 1+Math.max(left_height,right_height);


    }
}