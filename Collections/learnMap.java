import java.util.HashMap;
import java.util.Map;

public class learnMap {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two" , 2);
        numbers.put("Three", 3);

        /*
        //default behaviour of the hashmap is that if two key with the same name is added than the one which is added after will be used as the key=value pair
        numbers.put("Two", 23);
        */
        
        /*
        //To overcome this we can do 
        if(!numbers.containsKey("Two")){
            numbers.put("Two",2);
        }
        */

        //If we don't want to use the if 
        numbers.putIfAbsent("Two", 23);
        System.out.println("HashMap: " + numbers);
    }
}
