package collection;

import java.util.PriorityQueue;

public class Priority_Queue {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        // It follow the Min-Heap Data Structure to store the data and it also implement queue interface
        pq.add(100);
        pq.add(50);
        pq.add(150);   
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);

        // It support Duplicate Value
        pq.add(25);
        System.out.println(pq);

        //It does not support Heteroginous type of data
          // pq.add("pq");
          // System.out.println(pq);
        

        // Priority Queue Does not allow null value to stored in their Queus

    }
}
