import java.util.Stack;

//Stack is also known as LIFO -> last in first out

public class learnStack {
    public static void main(String[] args) {
        //Intializing the stack
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);


        System.out.println();
        //To check the top element --> using peek function
        System.out.println("Checking the topmost element of the stack");
        System.out.println(animals.peek());

        System.out.println();
        //To delete the element in the stack --> top element get deleted
        System.out.println("TO pop the element of the stack from the top");
        animals.pop();
        System.out.println(animals.peek());
    }
}
