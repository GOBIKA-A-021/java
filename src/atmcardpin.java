import java.util.Scanner;

public class atmcardpin {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int correctPin = 1234;
                int attempts = 0;

                while (attempts < 3) {
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();

                    if (pin == correctPin) {
                        System.out.println("Access Granted");
                        return;
                    } else {
                        System.out.println("Incorrect PIN, try again.");
                    }
                    attempts++;
                }

                System.out.println("Card Blocked");
            }
        }
