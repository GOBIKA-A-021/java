import java.util.Scanner;

public class moneywithdraw {
    public static void main(String[] args) {
        double bal=50000;
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        if(amt%100==0)
        {
            if(bal>=amt)
            {
                System.out.println("You can withdraw");
            }
            else {
                System.out.println("Withdraw not allowed");
            }

        }
        else
            System.out.println("Enter multiply of 100");
    }
}
