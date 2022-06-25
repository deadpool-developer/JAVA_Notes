import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Mathematics: ");
        float marks1 = sc.nextInt();
        System.out.print("Enter the marks of Physics: ");
        float marks2 = sc.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
        float marks3 = sc.nextInt();
        float sum = (marks1 + marks2 + marks3)/3;
        System.out.println(sum);
        sc.close();
        if((marks1 >=33 && marks2>=33 && marks3>=33) && sum>=40 ){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

    }
}
