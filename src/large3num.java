import java.util.Scanner;

public class large3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
            System.out.println("Large value :"+a);
        else if(b>a && b>c)
            System.out.println("Large value :"+b);
        else
            System.out.println("Large value :"+c);
    }
}
