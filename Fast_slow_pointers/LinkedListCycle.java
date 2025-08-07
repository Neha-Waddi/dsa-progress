package Fast_slow_pointers;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} 

public class LinkedListCycle {
    public static boolean detectLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
