import java.util.Scanner;

public class electricitybillusefun {
    public static void elebill(int u)
    {
        double bill = 0;

        if (u <= 100) {
            bill = u * 1.5;
        } else if (u <= 200) {
            bill = (100 * 1.5) + ((u - 100) * 2);
        } else {
            bill = (100 * 1.5) + (100 * 2) + ((u - 200) * 3);
        }


        System.out.println("Electricity Bill = " + bill);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units");
        int units = sc.nextInt();
        elebill(units);
    }
}
