
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class LinkedList
{
    Node head;  // head of list
}
public class intersectionLL {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node p1=head1;
        Node p2=head2;
        
        while(p1!=p2){
            if(p1.next!=null) p1=p1.next;
            else p1=head2;
            
            if(p2.next!=null) p2=p2.next;
            else p2=head1;
        }
        return p1;
    }
}
