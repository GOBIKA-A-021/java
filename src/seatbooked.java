import java.util.*;
public class seatbooked {
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);

            int seats = 10;

            for (int i = 1; i <= seats; i++) {
                System.out.print("Book a seat (1-10): ");
                int seatNo = sc.nextInt();
                System.out.println("Seat " + seatNo + " booked.");
            }

            System.out.println("House Full!");
            sc.close();
        }
    }


