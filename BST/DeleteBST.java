public class DeleteBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;

            TreeNode s_node=successor(root.right);
            root.val=s_node.val;
            root.right=deleteNode(root.right,s_node.val);
        }
        return root;
    }
    public TreeNode successor(TreeNode root){
        if(root==null) return null;
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}
