import java.util.Scanner;

public class Fibonacii_Series {
    static int n1=0 , n2=1 , n3=0;

    static void fibo(int a){
        if(a>0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            fibo(a-1);
        }
    }

    // Fibonacci series --> 0 1 1 2 3 5 8 13 21 34 .............
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print(n1 + " " + n2 + " ");
        fibo(x-2); // x-2 is done here because two numbers are already printed i.e 0 & 1
        sc.close();
    }
}
