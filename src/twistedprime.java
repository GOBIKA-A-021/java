import java.util.Scanner;

public class twistedprime {

    public static void prime(int a) {
        int count = 0;
        int rcount = 0;
        int rev = 0;
        for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    count++;
            }
        while (a != 0) {
            int d = a % 10;
            rev = rev * 10 + d;
            a /= 10;
        }
        for (int j = 1; j <= rev; j++) {
            if (rev % j == 0)
                rcount++;
        }
        if (count == 2 && rcount == 2) {

            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);

    }
}
