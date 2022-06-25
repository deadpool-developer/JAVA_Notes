import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        
        //Priority queue implements min heap by default --> elements are arranged in ascending order

        //Queue<Integer> pq = new PriorityQueue<>(); //this implement the min heap

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //This easily converts the min heap into max heap efficently
        pq.offer(34);
        pq.offer(41);
        pq.offer(12);
        pq.offer(1);

        System.out.println("Priority Queue: " + pq);

        //Now if we want to delete we use poll function --> deletes the first element

        System.out.println();
        System.out.println("Deleting the element using the poll function");
        System.out.println(pq.poll());
        System.out.println("Priority Queue: " + pq);

        //To see the next element in the priority queue
        System.out.println();
        System.out.println("Using peek function");
        System.out.println(pq.peek());

    }
}
