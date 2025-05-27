class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

public class CreateBTfromParentarr {
    public Node createTree(int parent[]) {
        // Your code here
        int n=parent.length;
        Node[] nodes=new Node[n];
        for(int i=0;i<n;i++){
            nodes[i]=new Node(i);
        }
        Node root=null;
        for(int i=0;i<n;i++){
            if(parent[i]==-1){
                root=nodes[i];
                continue;
            }
            Node parent_node=nodes[parent[i]];
            Node curr=nodes[i];
            if(parent_node.left==null){
                parent_node.left=curr;
            }
            else if(parent_node.right==null){
                parent_node.right=curr;
            }
            
        }
        return root;
    }
}
