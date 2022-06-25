package Chapter2.Operatore_Expression;
import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a); //compiler gives 2's complement of the number and not 1's complement
        System.out.println(~b); //compiler gives 2's complement of the number and not 1's complement
        sc.close();
    }
}
