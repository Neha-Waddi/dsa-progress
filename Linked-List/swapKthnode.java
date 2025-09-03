class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class swapKthnode {

    public Node swapKth(Node head, int k) {
        // code here
        Node fast=head;
        for(int i=0;i<k;i++){
            if(fast!=null)
            fast=fast.next;
            else return head;
            
        }
        Node slow=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        Node start=head;
        for(int i=1;i<=k-1;i++){
            start=start.next;
        }
        int temp=start.data;
        start.data=slow.data;
        slow.data=temp;
        
        return head;
    }
}