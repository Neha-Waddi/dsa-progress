public class TrimBST {
    public TreeNode trimBST(TreeNode root, int low, int high) {
         
        return  remove(root,low,high);
    }
    public TreeNode remove(TreeNode node,int low,int high){
        if(node==null) return null;
        TreeNode left=remove(node.left,low,high);
        TreeNode right=remove(node.right,low,high);

        if(node.val>=low && node.val<=high){
            node.left=left;
            node.right=right;
            return node;
        }
        else if(node.val<low){
            return node.right;
        }
        else
        return node.left;
    }
}
