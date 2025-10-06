import java.util.Scanner;
public class rolldicecount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of times to roll the dice: ");
            int n = sc.nextInt();
            int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;

            for (int i = 1; i <= n; i++) {
                int roll = (int)(Math.random()*6)+1;

                if (roll == 1) c1++;
                else if (roll == 2) c2++;
                else if (roll == 3) c3++;
                else if (roll == 4) c4++;
                else if (roll == 5) c5++;
                else c6++;
            }

            System.out.println("Results after " + n + " rolls:");
            System.out.println("1 appeared " + c1 + " times");
            System.out.println("2 appeared " + c2 + " times");
            System.out.println("3 appeared " + c3 + " times");
            System.out.println("4 appeared " + c4 + " times");
            System.out.println("5 appeared " + c5 + " times");
            System.out.println("6 appeared " + c6 + " times");
        }
    }

