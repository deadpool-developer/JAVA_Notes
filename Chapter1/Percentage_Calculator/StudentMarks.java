package Chapter1.Percentage_Calculator;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // to take input from the user
        System.out.println("Enter the name of Student:");
        String name1 = sc.nextLine(); // to read the full name
        System.out.println("Enter the Maths marks of the student:");
        float marks1 = sc.nextFloat();
        System.out.println("Enter the Physics marks of the student:");
        float marks2 = sc.nextFloat();
        System.out.println("Enter the Chemistry marks of the student:");
        float marks3 = sc.nextFloat();
        System.out.println("Enter the English marks of the student:");
        float marks4 = sc.nextFloat();
        System.out.println("Enter the Computer Science marks of the student:");
        float marks5 = sc.nextFloat();
        float percentage = (marks1 + marks2 + marks3 + marks4 + marks5)/5;
        System.out.print("The total percentage of " + name1 + " is: ");
        System.out.println(percentage);
        sc.close();



    }
}
