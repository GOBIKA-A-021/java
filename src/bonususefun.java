import java.util.Scanner;

public class bonususefun {
    public static void main(String[] args) {
        double salary = 20000;
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        bonus(salary, year);
    }
        static void bonus(double a,int b) {
            if (b >= 10) {
                double totalamt = (a * 0.10) +a ;
                System.out.println("Bonus is" + " " + a * 0.10);
                System.out.println("salary is" + " " + totalamt);
            } else if (b >= 5) {
                double totalamt = (a * 0.05) + a;
                System.out.println("Bonus is" + " " + a * 0.05);
                System.out.println("salary is" + " " + totalamt);
            } else
                System.out.println("No Bonus salary only" + " " + a);
        }
    }

