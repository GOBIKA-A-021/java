import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Pizza");
        System.out.println("2.Burger");
        System.out.println("3.Pasta");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("Your bill is 250");
                break;
            }

            case 2: {
                System.out.println("Your bill is 150");
                break;
            }
            case 3: {
                System.out.println("Your bill is 200");
                break;
            }
            case 4:
            {
                System.out.println("Exiting");
                break;
            }
            default:System.out.println("Please enter correct choice");

        }
    }
}
