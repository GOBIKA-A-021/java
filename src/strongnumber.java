import java.util.Scanner;

public class strongnumber {
    public static boolean strong(int n)
    {   int org=n;
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum+=factorial(d);
            n/=10;
        }
        if(org==sum)
            return true;
        else
            return false;
    }
    public static int factorial(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact*=i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(strong(num))
        {
            System.out.println("Strong number");
        }
        else {
            System.out.println("Not a strong number");
        }
    }
}