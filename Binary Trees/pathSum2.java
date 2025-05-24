import java.util.ArrayList;
import java.util.List;

public class pathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        paths(root,0,targetSum,path,res);
        return res;
    }
    public void paths(TreeNode root,int sum,int target,List<Integer> path,List<List<Integer>> res){
        if(root==null) return;

        path.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(target==sum)
            res.add(new ArrayList<>(path));
        }
        else{
        paths(root.left,sum,target,path,res);
        paths(root.right,sum,target,path,res);
        }
        path.remove(path.size() - 1);
    }
}
