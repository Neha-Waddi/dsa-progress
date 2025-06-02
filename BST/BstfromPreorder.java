public class BstfromPreorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int num:preorder){
            root=insert(root,num);
        }
        return root;
    }
    public TreeNode insert(TreeNode root,int data){
        if(root==null){
            TreeNode node=new TreeNode(data);
            return node;
        }
        if(data<root.val){
            root.left=insert(root.left,data);
        }
        else if(data>root.val){
            root.right=insert(root.right,data);
        }
        return root;
    }
}
