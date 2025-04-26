class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode start=head;


        while(start!=null && start.next!=null){
           if(start.val==start.next.val){
            start.next=start.next.next;
           }
           else{
            start=start.next;
           }
        }
        return head;

    }
}