package Chapter1.User_Input;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in); //system.in ---> to read from the keyboard
        System.out.println("Enter number 1");
        int a  = sc.nextInt(); //to take the integer input
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum =  a+b;
        System.out.println("THe sum of these number is");
        System.out.println(sum);
        sc.close(); // if not used resouce leak error will be given

    }
}
