import java.util.Scanner;

public class hospitalbedavailable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of beds: ");
                int totalBeds = sc.nextInt();

                int admitted = 0;

                while (admitted <= totalBeds) {
                    System.out.print("Enter patient name: ");
                    String name = sc.next();

                    if (admitted < totalBeds) {
                        System.out.println("Admitted: " + name);
                        admitted++;
                    } else {
                        System.out.println("No bed available, patient"+name+" sent to waiting list");
                        break;
                    }

                }

                System.out.println("All beds are filled!");

            }

        }



