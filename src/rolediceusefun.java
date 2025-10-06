import java.util.Scanner;

public class rolediceusefun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dice(sc);
    }
    public static void dice(Scanner sc)
    {
        String choice;

        do {
            int d = (int)(Math.random() * 6) + 1;
            System.out.println("You rolled: " + d);

            System.out.print("Do you want to roll again? (Y/N): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("Thank You!");

    }
    }

