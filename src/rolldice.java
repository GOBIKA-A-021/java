import java.util.Scanner;

public class rolldice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            int dice = (int)(Math.random() * 6) + 1;
            System.out.println("You rolled: " + dice);

            System.out.print("Do you want to roll again? (Y/N): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("Thank You!");

    }
}









