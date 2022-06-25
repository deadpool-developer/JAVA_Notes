import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        int chances = 0;
        int comp_score = 0;
        int user_score = 0;
        Scanner sc = new Scanner(System.in); // taking users input
        Random random = new Random(); // generating the random number within the range 0-2
        while (chances < 5) {
            System.out.println("Choose any number:");
            System.out.println("\t0. Scissor");
            System.out.println("\t1. Rock");
            System.out.println("\t2. Paper");
            int user_input = sc.nextInt();
            int computer_input = random.nextInt(3);
            System.out.println(user_input);
            System.out.println(computer_input);
            if (user_input == computer_input) {
                chances++;
            } else if ((user_input == 0 && computer_input == 1) || (user_input == 1 && computer_input == 2)
                    || (user_input == 2 && computer_input == 0)) {
                comp_score += 1;
                chances++;
            } else if ((user_input == 1 && computer_input == 0) || (user_input == 2 && computer_input == 1)
                    || (user_input == 0 && computer_input == 2)) {
                user_score += 1;
                chances++;
            }
        }
        if (user_score == comp_score) {
            System.out.println("TIE!!");
            System.out.println("SCORE -> " + user_score + " --- " + comp_score);

        } else if (user_score > comp_score) {
            System.out.println("SCORE -> " + user_score + " --- " + comp_score);
            System.out.println("USER WINS!!");
        } else {
            System.out.println("SCORE -> " + user_score + " --- " + comp_score);
            System.out.println("COMPUTER WINS!!");

        }

        sc.close();

    }
}
