import java.util.Scanner;

public class armstrongusefun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        armstrong(num);
    }
    public static void armstrong(int n)
    {
        int num1 = n;
        int sum = 0;
        int digit = String.valueOf(n).length();
        while (n != 0) {
            int last = n % 10;
            sum += Math.pow(last, digit);
            n/= 10;
        }

        if (sum == num1) {
            System.out.println(num1 + " is an Armstrong number.");
        } else {
            System.out.println(num1 + " is not an Armstrong number.");
        }

    }

}
