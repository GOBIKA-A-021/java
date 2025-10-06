import java.util.Scanner;

public class digitaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num >= 10) {
            int sum=0;
            int num1 = num;

            while (num1 >0) {
                int rem = num1% 10;
                sum+= rem;
                num1 /= 10;
            }
            num = sum;
        }

        System.out.println("Output: " + num);

    }
}
