import javax.swing.*;
import java.util.*;
public class factprimegcdusefun {
    public static int factorial(int n1)
    {
        int factorial=1;
        for(int i=1;i<=n1;i++)
            factorial*=i;
        return factorial;

    }
    public static void prime(int n2)
    {
        int count=0;
        for (int i = 1; i <=n2; i++) {
            if (n2% i == 0) {
                count++;
            }
        }
        if (count == 2) {
             System.out.println("Prime number");
        } else {
            System.out.println(" NOt a Prime number");
        }

    }
    public static void gcdnum ( int a, int b) {
        int gcd = 1;
        int max=0;
        if(a>b)
            max=a;
        else
            max=b;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("Gcd is:" + gcd);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Factorial");
        System.out.println("2.Prime number");
        System.out.println("3.GCD");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter a number to find factorial");
                int num1=sc.nextInt();
                System.out.println("Factorial is:"+factorial(num1));
                break;
            case 2:
                System.out.println("Enter a number to find whether prime or not ");
                int num2=sc.nextInt();
                prime(num2);
                break;
            case 3:
                System.out.println("Enter a number1 to find GCD ");
                int num3=sc.nextInt();
                System.out.println("Enter a number2 to find GCD ");
                int num4=sc.nextInt();
                gcdnum(num3,num4);
                break;
            default:
                System.out.println(" please,Enter the correct choice");
                break;



        }
    }
}
