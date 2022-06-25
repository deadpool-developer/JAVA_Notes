package Chapter1.User_Input;
import java.util.Scanner;
public class UserInputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you enter a line of word, next will only read first word and rest is ignored");
        String str = sc.next(); // reads only the first word
        // System.out.println("nextLine() reads the whole line");
        // String str_whole = sc.nextLine();  //reads the complete line
        System.out.println(str);
       // System.out.println(str_whole);
        sc.close();
    }
}
