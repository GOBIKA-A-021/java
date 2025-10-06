import java.util.*;
public class digitmultiply {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            while (num >= 10) {
                int product = 1;
                int num1 = num;

                while (num1 > 0) {
                    int rem = num1% 10;
                    product *= rem;
                    num1 /= 10;
                }
                num = product;
            }

            System.out.println("Output: " + num);

        }
    }

