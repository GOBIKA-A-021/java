import java.util.Scanner;

public class customersbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of customers");
        int n = sc.nextInt();
        System.out.println("Enter the number of customers bill");
        for(int i=1;i<=n;i++) {
            int bill = sc.nextInt();
            sum+=bill;
        }
        System.out.println("Total bill amount:"+sum);

    }
}
