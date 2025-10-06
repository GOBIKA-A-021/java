import java.util.*;
public class oddevenusefun {
    public static void  evenodd(int n) {

        if (n % 2 == 0)
           System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        evenodd(a);
    }
}
