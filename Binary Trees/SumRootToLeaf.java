public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    public int sum(TreeNode root,int curr){
        if(root==null) return 0;

        curr=curr*10+root.val;
        if(root.left==null && root.right==null){
            return curr;
        }
        return sum(root.left,curr)+sum(root.right,curr);
    }
}
