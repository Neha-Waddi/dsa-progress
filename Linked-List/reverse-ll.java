class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode next=null;
        ListNode temp=head;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}