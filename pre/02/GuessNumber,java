import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 \n(including both). Can you guess what it is?");
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guess = in.nextInt();
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + Math.abs(guess - number));
    }

}