public class LcaBst {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        return root;

        if(p.val==root.val || q.val==root.val)
        return root;

        if(p.val<root.val && q.val<root.val)
        return lowestCommonAncestor(root.left,p,q);
        if(p.val>root.val && q.val>root.val)
        return lowestCommonAncestor(root.right,p,q);

        return root;

    }
}
