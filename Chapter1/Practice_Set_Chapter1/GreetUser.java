package Chapter1.Practice_Set_Chapter1;
import java.util.Scanner;
public class GreetUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", Good Morning!!" );
        sc.close();
    }
}
