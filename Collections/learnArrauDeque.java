import java.util.ArrayDeque;

public class learnArrauDeque {
    public static void main(String[] args) {
        //Array deque is a doubly linked list in which we can insert the element from front and back and delete and peek also
        //Used in sliding window

        ArrayDeque <Integer> dq = new ArrayDeque<>();

        dq.offer(12); // it is similar to other functions and add the elements line wise
        dq.offerFirst(34); // It adds the element in the first 
        dq.offerLast(41); // It adds the element at the last
        System.out.println("ArrayDeque: " + dq);

        //Using the peek function 
        System.out.println();
        System.out.println("Using peek: " + dq.peek());
        System.out.println("Using peekFirst: " + dq.peekFirst());
        System.out.println("Using peekLast: " + dq.peekLast());

        //Using the poll function to delete the element
        System.out.println();
        System.out.println("Using poll: " + dq.poll());
        System.out.println(dq);
        System.out.println("Using pollFirst: " + dq.pollFirst());
        System.out.println(dq);
        System.out.println("Using pollLast: " + dq.pollLast());
        System.out.println(dq);

        //Stack can also be implemented using the array deque
        // TO add the element use the offer and add function
        // To delete the element use the function pollLast()



    }
}
