package PracticeSet;

import java.util.Scanner;

public class multiplicationTable {

    static void table(int a){
        for(int i = 1; i<11;i++){
            System.out.println(i + " x " + a + " = " + i*a );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        table(x);
        sc.close();
    }
}
