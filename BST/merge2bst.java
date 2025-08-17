import java.util.ArrayList;

public class merge2bst {
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer> in1=new ArrayList<Integer>();
        ArrayList<Integer> in2=new ArrayList<Integer>();
        
        inorder(root1,in1);
        inorder(root2,in2);
        
        ArrayList<Integer> res=new ArrayList<>();
        
        int i=0;
        int j=0;
        
        while(i<in1.size() && j<in2.size()){
            if(in1.get(i)<=in2.get(j)){
                res.add(in1.get(i++));
            }
            else{
                res.add(in2.get(j++));
            }
        }
        while(i<in1.size()){
             res.add(in1.get(i++));
        }
        while(j<in2.size()){
             res.add(in2.get(j++));
        }
        return res;
    }
    public void inorder(Node root,ArrayList<Integer> list){
        if(root==null) return;
        
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
}
