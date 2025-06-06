import java.util.*;

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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean last=false;
        while(!q.isEmpty()){
            TreeNode curr=q.poll();

            if(curr.left!=null){
                if(last) return false;
                q.offer(curr.left);
            }
            else{
                last=true;;
            }

            if(curr.right!=null){
                if(last) return false;
                q.offer(curr.right);
            }
            else{
                last=true;
            }
        }
        return true;
    }
}