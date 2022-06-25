import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        int num = sc.nextInt();
        for(int i = num;i!=0 ; i--){
            ans *= i;
        }
        System.out.printf("The factorial of the number %d is: %d",num,ans);
        sc.close();
    }
}
