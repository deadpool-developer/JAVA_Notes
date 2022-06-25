package Chapter1.Practice_Set_Chapter1;
import java.util.Scanner;
public class AddThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third Number");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.printf("The sum of the numbers are: %d" ,sum);
        sc.close();
    }
}
