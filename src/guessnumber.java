import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret=50;
        int attempts=5;
        boolean win=false;
        System.out.println("Guess the number between 1 and 100 (You have 5 attempts):");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": ");
            int guess = sc.nextInt();

            if (guess == secret) {
                System.out.println("You Win The number was " + secret);
                win = true;
                break;
            } else if (guess < secret) {
                System.out.println("Greater than this value");
            } else {
                System.out.println("Lower than this value");
            }
        }
         if(!win)
        System.out.println("You Lose. The correct number was " + secret);
    }
            }


