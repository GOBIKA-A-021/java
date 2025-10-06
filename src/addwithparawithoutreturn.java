import java.util.Scanner;

public class addwithparawithoutreturn {
    public  static void add(int n1,int n2)
    {
        System.out.println("Sum is:"+(n1+n2)) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);

    }
}
