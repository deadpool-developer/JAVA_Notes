package Chapter1.User_Input;
import java.util.Scanner;

public class UserInputFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        float a = sc.nextFloat(); // To take float input
        float b = sc.nextFloat();
        System.out.println(a+b);
        sc.close();
    }
}
