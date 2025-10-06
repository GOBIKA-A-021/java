import java.util.Scanner;

public class ducknumberusefun {
    public static boolean duck(int n) {
        while (n != 0) {
            int digit = n % 10;
            if (digit == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }



    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(duck(num))
        {
            System.out.println("Duck number");
        }
        else
        {
            System.out.println(" Not a Duck number");
        }
    }
}
