import java.util.Scanner;

public class primenumberboolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        int i;
        int n = sc.nextInt();
        for ( i = 2; i <= n; i++) {
            boolean isprime = true;
            for ( j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.println(+i+ "is Prime number");
            } else {
                System.out.println(+i +"is  Not a Prime number");
            }
        }
    }
}
