import java.util.*;
public class TwoSumBST {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set=new HashSet<>();
        return search(root,k,set);
    }
    public boolean search(TreeNode root,int k,Set<Integer> set){
        if(root==null) return false;
        if(set.contains(k-root.val)) return true;
        set.add(root.val);
        return search(root.left,k,set) || search(root.right,k,set);
    }
}
