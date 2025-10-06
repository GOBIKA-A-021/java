import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Deposit money");
        System.out.println("2.Withdraw money");
        System.out.println("3.Check balance");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        double balance=10000;
        switch(ch)
        {
            case 1:{
                System.out.println("Enter  deposit amount");
                int amt=sc.nextInt();
                 balance=balance+amt;
                 System.out.println("balance"+balance);
                break;}
            case 2:{
                System.out.println("Enter  withdraw amount");
                int amt1=sc.nextInt();
                if(balance>amt1){
                    balance=balance - amt1;
                    System.out.println("balance:"+balance);
                }
                else
                    System.out.print("Insufficient balance");
                break;
            }
            case 3:{
               System.out.println("Balance:"+balance);

                break;
            }
            case 4:{
                System.out.println("Thank you");
                break;
            }
            default:
                System.out.println("Enter correct choice");
        }

    }
}
