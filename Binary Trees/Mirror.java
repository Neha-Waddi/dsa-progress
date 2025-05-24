public class Mirror {
     void mirror(Node node) {
        // Your code here
        if(node==null) return;
        if(node.left==null && node.right==null) return ;
        
        swap(node);
        mirror(node.left);
        mirror(node.right);
        
        
    }
    Node swap(Node node){
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
        
        return node;
        
    }
}
