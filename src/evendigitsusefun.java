import java.util.*;
public class evendigitsusefun {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       evennum(num);
    }
    public static void evennum(int n)
    {
        boolean even=true;
        while(n!=0)
        {
            int d=n%20;
            if(d%2!=0)
            {
                even=false;
                System.out.println("No");
                break;
            }
            n/=10;
        }
        if(even)
            System.out.println("No");

    }
}
