package Chapter1.Practice_Set_Chapter1;
import java.util.Scanner;
public class NumberEnteredIsInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is integer or not:");
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
