import java.util.Scanner;;
public class Recursion {

/*
1. Factorial of a number is given by --> n * n-1 * n-2 * ..... * 1
2. To calculate the factorial of the number 5 --> 5 * 4 * 3 * 2 * 1
3. Formulae to calculate the factorial in recursive approach is --> n*fact(n-1)
*/


    static int Fact(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a*Fact(a-1);
        }
    }

    static int Fact_iterative(int b){
        int product = 1;
        for(int i=1;i<=b;i++){
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.format("Factorial of the number %d is: %d\n",x,Fact(x));
        System.out.format("Factorial of the number %d is: %d ",x,Fact_iterative(x));
        sc.close();
    }
}
