import java.util.Scanner;

public class basiccalculatorusefun {
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int n1=sc.nextInt();
        System.out.println("Enter number2");
        int n2=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println(add(n1,n2));
                   break;
            case 2:System.out.println(sub(n1,n2));
                   break;
            case 3:System.out.println(mul(n1,n2));
                   break;
            case 4:System.out.println(div(n1,n2));
                   break;
            default:
                System.out.println("Enter correct choice");
                break;
        }
    }
}
