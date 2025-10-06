import java.util.*;
public class ticketfareusefun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = 0;
        System.out.println("Enter the number of pasengers");
        int n = sc.nextInt();
        System.out.println("Enter the pasengers age");
        for (int i = 1; i <= n; i++) {
            int age = sc.nextInt();
            amt += ticket(age);
        }
        System.out.println("Totalfare:" + amt);

    }
    public static int ticket(int a)
    {

        if (a < 12) {
            return 50;
        } else if (a >= 12 && a <= 59) {
            return 100;
        } else {
            return 70;
        }
    }
}



