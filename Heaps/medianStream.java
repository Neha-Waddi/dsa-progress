import java.util.PriorityQueue;

public class medianStream {
    PriorityQueue<Integer> maxheap;
    PriorityQueue<Integer> minheap;

    public medianStream() {
        maxheap=new PriorityQueue<>((a,b)->b-a);
        minheap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxheap.offer(num);
        minheap.offer(maxheap.poll());

        if(minheap.size()>maxheap.size()){
            maxheap.offer(minheap.poll());
        }
    }
    
    public double findMedian() {
        if(maxheap.size()>minheap.size()){
            return maxheap.peek();
        }
        else
        return (maxheap.peek()+minheap.peek())/2.0;
    }
}
