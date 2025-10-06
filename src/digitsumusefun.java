import java.util.Scanner;

public class digitsumusefun {
    public static void sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println("Sum:"+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sum(num);
    }
}
