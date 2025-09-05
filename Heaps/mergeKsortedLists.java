import java.util.PriorityQueue;

public class mergeKsortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode head:lists){
            if(head!=null)
            pq.offer(head);
        }

        ListNode res=new ListNode(0);
        ListNode temp=res;

        while(!pq.isEmpty()){
            ListNode front=pq.poll();
            temp.next=front;
            temp=front;

            if(front.next!=null) pq.offer(front.next);
        }
        return res.next;
    }
}
