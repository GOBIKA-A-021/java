import java.util.Scanner;

public class atmusefun {
    static double balance = 10000;

    public static void deposit(double a) {
        balance += a;
        System.out.println(a + " " + "amount deposited");
    }

    public static void withdraw(double a1) {

        if (balance > a1) {
            balance -= a1;
            System.out.println(a1 + " " + "amount withdrawn");
        } else
            System.out.print("Insufficient balance");
    }

    public static void getbalance() {
        ;
        System.out.println("Current balance:" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  deposit amount");
        double amt = sc.nextDouble();
        deposit(amt);
        getbalance();
        System.out.println("Enter  withdraw amount");
        double amt1 = sc.nextDouble();
        withdraw(amt1);
        getbalance();


    }
}


