package Chapter4;

import java.util.Scanner;

//Switch case os used when we have to make a choice between number of alternatives for a given variable
public class switchs {
    public static void main(String[] args) {
        System.out.print("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        /*
         * switch(age){
         * case 18:
         * System.out.println("You are going to become an adult");
         * break;
         * case 23:
         * System.out.println("You are going to join a job");
         * break;
         * case 60:
         * System.out.println("You are going to get retired");
         * break;
         * default:
         * System.out.println("Enjoy your life");
         * break;
         * }
         */

        // ENHANCED SWITCH  --> No break is needed in this
        switch (age) {
            // if there are multiple statments
            case 18 -> {
                System.out.println("You are going to become an adult");
                System.out.println("Yes i have more than one statement in my switch case");
            }
            case 23 -> System.out.println("You are going to join a job");
            case 60 -> System.out.println("You are going to get retired");
            default -> System.out.println("Enjoy your life");
        }
        System.out.println("Thansk for using my Java Code!!");

    }
}
