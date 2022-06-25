package Chapter1.User_Input;
import java.util.Scanner;

public class ToCheckTheInput {
    public static void main(String[] args) {
        // To check if the input is integer or not
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt(); //for int
        boolean b2 = sc.hasNextFloat(); // for float
        System.out.println(b1);
        System.out.println(b2);
        sc.close();
    }
}
