
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow=head;
        Node fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                count=1;
                slow=slow.next;
                while(slow!=fast){
                    count++;
                    slow=slow.next;
                }
                return count;
            }
        }
        return 0;
    }
}