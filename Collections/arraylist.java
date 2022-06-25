import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        //If we try to make an array than we to have to give the size during it's intialization
        //To overcome this ArrayList is used as it creates the space dynamically in the memory
        // If size of the array is n then after adding the element in the array it will be
        // n + n/2 + 1 and so on

        /* 
        //Array 
        String[] studentName = new String[30];
        studentName[0] = "Aditya";
        //
        //studentName[1] .... studentName[28]
        //
        studentName[29] = "Dhruv"; // Now our array is full and if we want to add another student than it is not possible
        studentName[30] = "Aryan"; // It will give error
        */

        //ArrayList

        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Aditya");
        studentName.add("Dhruv");
        System.out.println(studentName);

        //ADD function in ArrayList
         
        System.out.println("Add function to add the element in the ArrayList\n\n");
        //1. We can add the element at the specific position
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        System.out.println(newList);

        System.out.println("Add function to add the element at the particular index in the ArrayList\n\n");
        newList.add(2,34);
        System.out.println(newList);

        System.out.println("If we want to merge two list together, we use addAll function\n\n");
        //2. If we want to add one list into another list
        ArrayList<Integer> addedlist = new ArrayList<>();
        addedlist.add(23);
        addedlist.add(12);
        System.out.println(addedlist);

        newList.addAll(addedlist);
        System.out.println(newList); //Append the added list element at the last of the newList

        System.out.println("To get the element of the ArrayList we use the function get\n\n");
        //3. To get the element of the array

        System.out.println(newList.get(2)); //Give the element at the second position


        System.out.println("TO remove the element at the particular index we use remove function\n\n");
        //4. To remove the element from the index position of the ArratList

        newList.remove(1); //removes 2 from the newList
        System.out.println(newList);


        System.out.println("When we want to remove the particular value from the ArrayList we pass the value in the remove function\n\n");
        newList.remove(Integer.valueOf(34)); //Remove 34 from the newList
        System.out.println(newList);

        System.out.println("TO clear all the element from the list we use clear function\n\n");
        //5. To clear the whole list
        newList.clear();
        System.out.println(newList);

////////////TIME COMPLEXITY IS O(n)/////////////////////////////////

        // TO update the element in the array we use set function --> O(1)

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(12);
        l.add(131);
        l.add(11);
        l.add(15);
        l.add(18);
        l.add(16);

        System.out.println("If we want to update the particular element in the ArrayList we use set function\n\n");
        System.out.println(l);
        l.set(2, 100);
        System.out.println(l);
        System.out.println();

        // To find the element in the ArrayList is present or not
        System.out.println("If we want to find that the particular element is present in the arraylist or not\n");

        System.out.println(l.contains(23));
        System.out.println();

        //TO iterate the ArrayList
        System.out.println("Iterating the ArrayList using for loops\n");

        //Using for loop
        for(int i =0; i<l.size();i++){
            System.out.println("The element of the array list is: " + l.get(i));
        }

        //Using forEach
        System.out.println();
        System.out.println("Using forEach loop");
        for (Integer el : l) {
            System.out.println("The element of the array is: " + el);
            
        }

        //Using iterator function

        System.out.println();
        System.out.println("Using Iterator function");
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            System.out.println("Iterator: " + it.next());
        }
    }
}
