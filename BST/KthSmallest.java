public class KthSmallest {
    int count=0;
    int res=-1;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
    public void inorder(TreeNode root,int k){
        if(root==null) return;
        
        inorder(root.left,k);
        count++;
        if(k==count) {
            res=root.val;
            return;
        }
        inorder(root.right,k);
    }
}
