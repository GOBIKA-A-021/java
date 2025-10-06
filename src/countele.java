import java.util.*;
import java.io.*;
public class countele {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int reversed=0;
        int count=0;
        while(n>0)
        {
            int digit=n%10;
            reversed=reversed*10+digit;
            sum+=digit;
            n/=10;
            count++;
        }
        System.out.println(count);
        System.out.println(reversed);
        System.out.println(sum);

    }
}
