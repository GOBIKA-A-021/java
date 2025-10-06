import java.util.Scanner;

public class factorialusefun {
    public static int fact(int a)
    {
        int factorial=1;
        for(int i=1;i<=a;i++)
            factorial*=i;
        return factorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println("Factorial is:"+res);
    }
}
