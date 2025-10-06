import java.util.Scanner;

public class twistedprimesueboolean {
    public static boolean prime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;

        }
        if(count==2)
            return true;
        else
            return false;
    }
    public static boolean twistprime(int b ) {
        int rev=0;
        int rcount=0;
        while (b != 0) {
            int d = b % 10;
            rev = rev * 10 + d;
            b /= 10;
        }
        for (int j = 1; j <= rev; j++) {
            if (rev % j == 0)
                rcount++;
        }
        if(rcount==2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (prime(n) && twistprime(n)) {

            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }

    }
}
