class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)
        return head;
        
        ListNode odd=head;
        ListNode even=odd.next;
        ListNode attach=even;

        while(even !=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=attach;
        return head;


    }
}