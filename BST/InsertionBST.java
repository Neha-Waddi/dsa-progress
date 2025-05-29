public class InsertionBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        
        TreeNode pos = find(root, val);
        if (val < pos.val) pos.left = new TreeNode(val);
        else pos.right = new TreeNode(val);
        
        return root;
    }

    public TreeNode find(TreeNode root, int val) {
        TreeNode current = root;
        while (true) {
            if (val < current.val) {
                if (current.left == null) return current;
                current = current.left;
            } else {
                if (current.right == null) return current;
                current = current.right;
            }
        }
    }
}
