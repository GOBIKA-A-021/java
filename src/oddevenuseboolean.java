import java.util.Scanner;

public class oddevenuseboolean {
    public static boolean evenodd(int n) {

        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(evenodd(a))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
