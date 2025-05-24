import java.util.*;
public class LeafSimilarCheck {
     public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> leaf1=new ArrayList<>();
        List<Integer> leaf2=new ArrayList<>();     
        find(root1,leaf1);
        find(root2,leaf2);

        return leaf1.equals(leaf2);
        
    }
    public boolean isLeaf(TreeNode node){
        
        if(node!=null && node.left==null && node.right==null) return true;
        return false;
    }
    public void find(TreeNode root,List<Integer> res){
        if(root==null) return;
        
        if(isLeaf(root)) res.add(root.val);
        else{
            find(root.left,res);
            find(root.right,res);
        }
    }
}
