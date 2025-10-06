import java.util.Scanner;

public class Addusefunnonstatic {
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Addusefunnonstatic sum=new Addusefunnonstatic();
        System.out.println("Sum of 2 numbers is:"+sum.add(a,b));

    }
}
