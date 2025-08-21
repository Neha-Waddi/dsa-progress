public class rotateList {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null) return null;
        int n=1;

        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            n++;
        }

        k=k%n;
        if(k==0) return head;

        curr.next=head;

        curr=head;
        for(int i=1;i<n-k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;

        return head;

    }
}
