//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnSet {
    public static void main(String[] args) {
        
        //No duplicates are allowed in the set
        //Set<Integer> set = new HashSet<>();

        //There is another type which is known as LinkedHashSet --> all the property is same as the set but it maintains the order
        //Set<Integer> set = new LinkedHashSet<>();

        //Another property of set is TreeSet --> It stores the elements in the ascending order and also uses the property of the set
        Set<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(32);
        set.add(21);
        set.add(67);
        System.out.println("Set: " + set); //set is unordered and we can think set like a chatur bag in which we can add the element but no duplicate element can be added

        System.out.println();

        //Removing the element from the set using remove function
       set.remove(21);
       System.out.println("Set: " + set);

       System.out.println();
       //Now if we want to check if the element is present in the set or not
       System.out.println(set.contains(12));

       //If we want to check if the set is empty or not
       System.out.println();
       System.out.println(set.isEmpty());

       //To check the size of the set

       System.out.println();
       System.out.println(set.size());

       //To empty the set
       System.out.println();
       set.clear();
       System.out.println(set);

    }
}
