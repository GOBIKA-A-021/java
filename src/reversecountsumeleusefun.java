import java.util.Scanner;

public class reversecountsumeleusefun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        count(num);
    }
    public static void count(int n)
    {
        int sum=0;
        int reversed=0;
        int count=0;
        while(n>0)
        {
            int digit=n%10;
            reversed=reversed*10+digit;
            sum+=digit;
            n/=10;
            count++;
        }
        System.out.println("Count:"+count);
        System.out.println("Reversed:"+reversed);
        System.out.println("Sum:"+sum);
    }
}
