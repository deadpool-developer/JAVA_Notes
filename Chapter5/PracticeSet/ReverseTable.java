import java.util.Scanner;
public class ReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which table is needed to be printed: ");
        int num = sc.nextInt();
        for(int i = 10;i != 0;i--){
            System.out.println(num + " X " + i +" = " + num*i);
            
        }
        sc.close();
    }
}
