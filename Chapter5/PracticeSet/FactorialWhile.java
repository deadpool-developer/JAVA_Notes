import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num;
        int ans = 1;
        while(num!=0){
            ans *= num;
            num--;
        }
        System.out.printf("The factorial of the number %d is: %d",i,ans);
        sc.close();
    }
}
