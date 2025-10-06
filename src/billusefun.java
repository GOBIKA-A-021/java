import java.util.*;
public class billusefun {
    public static int bill(int a,Scanner sc) {
        int sum=0;
        System.out.println("Enter the number of customers bill");
        for (int i = 1; i <= a; i++) {
            int amt = sc.nextInt();
            sum += amt;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of customers");
        int n = sc.nextInt();
        int res=bill(n,sc);
        System.out.println("Total Bill is "+res);

    }

}
