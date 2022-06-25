import java.util.LinkedList;
import java.util.Queue;

public class learnLinkedListQueue {
    public static void main(String[] args) {
        //Linkedlist implements the queue interface
        Queue<Integer> queue = new LinkedList<>();

        //To add the elements in the queue we use offer function
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        System.out.println("Queue: " + queue);

        System.out.println();
        //To delete the element from the queue we use poll function
        System.out.println("Deleting the element from the queue using poll function");
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println();
        //Peek function is used to check the next element in the queue
        System.out.println(queue.peek());

    }
}
