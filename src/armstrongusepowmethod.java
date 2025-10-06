import java.util.*;
public class armstrongusepowmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int num1 = num;
        int sum = 0;
        int digit = String.valueOf(num).length();
        while (num != 0) {
            int last = num % 10;
            sum += Math.pow(last, digit);
            num/= 10;
        }

        if (sum == num1) {
            System.out.println(num1 + " is an Armstrong number.");
        } else {
            System.out.println(num1 + " is not an Armstrong number.");
        }

        }

    }

