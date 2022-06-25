package GuessTheNumber;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number; //random number
    public int inputNumber; //user input
    public int noOfGuesses = 0; //score

    public int getnoOfGuesses(){
        return noOfGuesses;
    }

    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeInputNumber(){
        System.out.println("Guess the Number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        sc.close();
    }

    boolean isCorrectNumber(){
        if(inputNumber == number){
            return true;
        }
        else if(inputNumber > number){
            System.out.println("Too High...");
            noOfGuesses += 1;
        }
        else if(inputNumber < number){
            System.out.println("Too Low...");
            noOfGuesses += 1;
        }
        return false;
    }
}

public class guess {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeInputNumber();
            b = g.isCorrectNumber();
           System.out.println(b);
        }
        System.out.format("Your score is: " + g.getnoOfGuesses());

    }
}