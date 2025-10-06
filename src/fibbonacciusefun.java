import java.util.Scanner;

public class fibbonacciusefun {
    public static int fibbo(int n) {
        if (n <= 1)
            return n;
        else
            return fibbo(n - 1) + fibbo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
            System.out.print(fibbo(i));
    }
}
