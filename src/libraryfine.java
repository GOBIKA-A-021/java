import java.util.*;
public class libraryfine
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of days late: ");
            int daysLate = sc.nextInt();

            int fine = 0;

            if (daysLate <= 0) {
                System.out.println("Book returned on time. No Fine.");
            }
            else if (daysLate <= 5) {
                fine = daysLate * 2;
                System.out.println("Fine = " + fine);
            }
            else if (daysLate <= 10)
            {
                fine = daysLate * 4;
                System.out.println("Fine = " + fine);
            }
            else if (daysLate <= 13)
            {
                fine = daysLate * 8 ;
                System.out.println("Fine = " + fine);
            }
            else if(daysLate>13){
                //fine = daysLate * 20;
                //System.out.println("Fine = " + fine);
                System.out.println("Membership Suspended");
            }
        }
    }


