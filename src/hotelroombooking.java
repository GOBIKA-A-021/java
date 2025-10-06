import java.util.*;
public class hotelroombooking
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter room type (Deluxe/Standard): ");
            String roomType = sc.next();

            System.out.print("Is it peak season? (true/false): ");
            boolean peak = sc.nextBoolean();

            System.out.print("Is customer Regular? (true/false): ");
            boolean regular = sc.nextBoolean();

            System.out.print("Enter nights: ");
            int nights = sc.nextInt();

            double rate = 0;


            switch (roomType.toLowerCase()) {
                case "deluxe":
                    rate = peak ? 5000 : 3500;
                    break;
                case "standard":
                    rate = 2000;
                    break;
                default:
                    System.out.println("Invalid room type!");
                    return;
            }

            double total = rate * nights;


            if (regular) {
                total = total * 0.10;
            }

            System.out.println("Total Booking Cost = " + total);
        }
    }

